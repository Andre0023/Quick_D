package ru.lanit.at.steps.etap;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.ru.И;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class FrequencyOccurrence {
    private final SelenideElement frequencyOccurrenceSmell = $("[type='radio'][value='Каждый день']").parent();

    @Step("Выбор периодичности появления запахов.")
    @И("Выбор периодичности появления запахов.")
    public void FrequencyOccurrence() {
        Allure.addAttachment("Page Source", "text/html", WebDriverRunner.source(), "html");
        frequencyOccurrenceSmell.click();

    }
}
