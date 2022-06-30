package ru.lanit.at.steps.etap;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.И;
import io.qameta.allure.Step;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CheckForm {

    private final SelenideElement checkNumber = $(".quiz-air-quality-inline-form");


    @Step("Провека открытии 5й формы")
    @ExtendWith(TestListener.class)
    @И("Проверка формы 5 и 5.")
    public void CheckForm() {




        checkNumber.shouldHave(text("Вопрос 5/5 "));


    }

}
