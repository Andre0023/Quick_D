package Base;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public static WebDriver driver;
    private static final int TIMOUT = 15;

    @BeforeEach

    public void setUp(){

        ChromeOptions chromeOptions = new ChromeOptions();
        // chromeOptions.addArguments("--headless");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(TIMOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(TIMOUT, TimeUnit.SECONDS);
    }


}