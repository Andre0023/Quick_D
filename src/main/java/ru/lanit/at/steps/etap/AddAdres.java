package ru.lanit.at.steps.etap;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.ru.И;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AddAdres {
    private final SelenideElement setOpen = $("#address-autocomplete");
    private final SelenideElement setAdres = $(byText("город Москва, Открытое шоссе, дом 19А"));

    @Step("Заполняем адрес.")
    @И("Заполняем адрес.")
    public void AddAdres() {

        setOpen.setValue("открытое");
        setAdres.click();


    }
}
