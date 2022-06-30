package ru.lanit.at.steps.etap;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.И;
import io.qameta.allure.Step;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selenide.$;

public class BadSmell {
    private final SelenideElement smell = $("[type='radio'][value='Другое']").parent();
    private final SelenideElement typeSmell = $("[name='smell_type_custom']");


    @Step("Выбор характер запаха.")
    @ExtendWith(TestListener.class)
    @И("Выбор характер запаха.")
    public void BadSmell() {

        smell.click();
        typeSmell.setValue("Клопы");

    }
}
