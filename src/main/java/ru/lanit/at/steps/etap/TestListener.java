package ru.lanit.at.steps.etap;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static Base.BaseTest.driver;


public class TestListener implements TestWatcher {

    @AfterEach
    public void testSuccessful(ExtensionContext context, Throwable cause) {

        Allure.getLifecycle().addAttachment(
                "screenshot", "image/png", "png"
                , ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)
        );
        driver.close();
        driver.quit();
    }
}