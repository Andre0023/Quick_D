package ru.lanit.at.steps.etap;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.И;
import io.qameta.allure.Step;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selenide.$;

public class FrequencyOccurrence {
    private final SelenideElement frequencyOccurrenceSmell = $("[type='radio'][value='Каждый день']").parent();

    @Step("Выбор периодичности появления запахов.")
    @ExtendWith(TestListener.class)
    @И("Выбор периодичности появления запахов.")
    public void FrequencyOccurrence() {

        frequencyOccurrenceSmell.click();

    }
}
