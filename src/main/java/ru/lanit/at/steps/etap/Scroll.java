package ru.lanit.at.steps.etap;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.И;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Scroll {
    private final SelenideElement scroll = $(byText("Ответить"));

    @Attachment
    @ExtendWith(TestListener.class)
    @Step("Прокрутка экрана вниз.")
    @И("Прокрутка экрана вниз.")
    public void Scroll() {






    }

    }


