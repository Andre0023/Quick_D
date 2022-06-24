package ru.lanit.at.steps.etap;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.ru.И;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;

import java.nio.charset.StandardCharsets;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Scroll {
    private final SelenideElement scroll = $(byText("Ответить"));

    @Step("Прокрутка экрана вниз.")
    @И("Прокрутка экрана вниз.")
    public void Scroll() {
        Allure.addAttachment("Page Source", "text/html", WebDriverRunner.source(), "html");
        scroll.scrollTo();


    }
    @Attachment(value = "Screenshot", type = "text/html", fileExtension = "html")
    public byte[] attachPageSource(){
        Allure.addAttachment("Page Source", "text/html", WebDriverRunner.source(), "html");
        return WebDriverRunner.source().getBytes(StandardCharsets.UTF_8);
    }

}
