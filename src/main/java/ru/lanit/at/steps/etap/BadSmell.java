package ru.lanit.at.steps.etap;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.ru.И;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class BadSmell {
    private final SelenideElement smell = $("[type='radio'][value='Другое']").parent();
    private final SelenideElement typeSmell = $("[name='smell_type_custom']");


    @Step("Выбор характер запаха.")
    @И("Выбор характер запаха.")
    public void BadSmell() {

        smell.click();
        typeSmell.setValue("Клопы");

    }
}
