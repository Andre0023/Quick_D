package ru.lanit.at.steps.etap;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.java.ru.Дано;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;

import java.nio.charset.StandardCharsets;

public class BeforStep  {


//mvn clean test  -Ddataproviderthreadcount=4  -Dscreen_after_step=true -Dtags="   запуск теста

    @Step("Открыть сайт")
    @Дано("Открыть {string}")
    public void OpenMsecom(String url) {
        Configuration.browserSize = "1920x1080";
        Selenide.open(url);
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        attachPageSource();
        SelenideLogger.addListener("allure", new AllureSelenide());
        Allure.addAttachment("Page Source", "text/html", WebDriverRunner.source(), "html");
    }
    public byte[] attachPageSource(){
        return WebDriverRunner.source().getBytes(StandardCharsets.UTF_8);
    }



}
