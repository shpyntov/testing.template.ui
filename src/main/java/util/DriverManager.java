package util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class DriverManager {

    private static final ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
    private DriverManager() { initializeDriver(); }

    public static WebDriver createDriver() {
        if (null == driver.get()) { initializeDriver(); }
        return driver.get();
    }

    private static void initializeDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions browserOptions = new ChromeOptions().addArguments(getBrowserOptionsFromFile().get("options"));
        driver.set(new ChromeDriver(browserOptions));
    }

    private static Map<String, List<String>> getBrowserOptionsFromFile() {
        InputStream file = DriverManager.class.getClassLoader().getResourceAsStream("browser/chrome.yml");
        return new Yaml().load(file);
    }
}