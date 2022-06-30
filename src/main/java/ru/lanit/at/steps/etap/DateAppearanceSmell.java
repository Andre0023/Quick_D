package ru.lanit.at.steps.etap;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.И;
import io.qameta.allure.Step;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DateAppearanceSmell {
    private final SelenideElement dateAppearance = $("[id='report-date']");
    private final SelenideElement numberAppearance = $(byText("16"));
    private final SelenideElement intervalAppearance = $(".multi-selector-input").$(byText("Выберите временные отрезки"));
    private final SelenideElement timeAppearance = $("[type='checkbox'][value='2']").parent();


    @Step("Выбор даты и отрезка появления запаха.")
    @ExtendWith(TestListener.class)
    @И("Выбор даты и отрезка появления запаха.")
    public void DateAppearanceSmell() {


        dateAppearance.click();
        numberAppearance.click();
        intervalAppearance.click();
        timeAppearance.click();


    }
}
