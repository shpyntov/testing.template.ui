package fixtures;

import io.github.bonigarcia.seljup.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import wordpress.PageClient;


@ExtendWith(SeleniumJupiter.class)
public class BasicTest {

    protected WebDriver driver;
    protected PageClient pages;

    @Options
    protected ChromeOptions chromeOptions = new ChromeOptions();{
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("--disable-extensions");
        chromeOptions.addArguments("--disable-infobars");
        chromeOptions.addArguments("--ignore-certificate-errors");
    }

    @BeforeEach
    public void setUp(ChromeDriver driver) {
        this.driver = driver;
        this.pages = new PageClient(driver, new WebDriverWait(driver, 10));
        pages.wdTools.startPage();
    }
}
