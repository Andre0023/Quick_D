package ru.lanit.at.steps.etap;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.ru.И;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SendForm {
    private final SelenideElement send0 = $("[id='quiz-page-id-0']").$(byText("Ответить"));
    private final SelenideElement send1 = $("[id='quiz-page-id-1']").$(byText("Ответить"));
    private final SelenideElement send2 = $("[id='quiz-page-id-2']").$(byText("Ответить"));
    private final SelenideElement send3 = $("[id='quiz-page-id-3']").$(byText("Ответить"));

    @Step("Нажать кнопку Отправить")
    @И("Нажать кнопку Отправить 1.")
    public void SendFormOne() {
        Allure.addAttachment("Page Source", "text/html", WebDriverRunner.source(), "html");
       send0.click();

    }

    @Step("Нажать кнопку Отправить")
    @И("Нажать кнопку Отправить 2.")
    public void SendFormTwo() {
        Allure.addAttachment("Page Source", "text/html", WebDriverRunner.source(), "html");
        send1.click();
    }

    @Step("Нажать кнопку Отправить")
    @И("Нажать кнопку Отправить 3.")
    public void SendFormThree() {
        Allure.addAttachment("Page Source", "text/html", WebDriverRunner.source(), "html");
        send2.click();
    }

    @Step("Нажать кнопку Отправить")
    @И("Нажать кнопку Отправить 4.")
    public void SendFormFour() {
        Allure.addAttachment("Page Source", "text/html", WebDriverRunner.source(), "html");
        send3.click();


    }
}
