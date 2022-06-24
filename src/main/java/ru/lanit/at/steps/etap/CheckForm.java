package ru.lanit.at.steps.etap;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.ru.И;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.screenshot;

public class CheckForm {

    private final SelenideElement checkNumber = $(".quiz-air-quality-inline-form");


    @Step("Провека открытии 5й формы")
    @И("Проверка формы 5 и 5.")
    public void CheckForm() {




        checkNumber.shouldHave(text("Вопрос 5/5 "));


    }

}
