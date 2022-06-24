package ru.lanit.at.steps.etap;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.ru.И;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;



import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DateAppearanceSmell {
    private final SelenideElement dateAppearance = $("[id='report-date']");
    private final SelenideElement numberAppearance = $(byText("16"));
    private final SelenideElement intervalAppearance = $(".multi-selector-input").$(byText("Выберите временные отрезки"));
    private final SelenideElement timeAppearance = $("[type='checkbox'][value='2']").parent();


    @Step("Выбор даты и отрезка появления запаха.")
    @И("Выбор даты и отрезка появления запаха.")
    public void DateAppearanceSmell() {
        Allure.addAttachment("Page Source", "text/html", WebDriverRunner.source(), "html");

        dateAppearance.click();
        numberAppearance.click();
        intervalAppearance.click();
        timeAppearance.click();


    }
}
