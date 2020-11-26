package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverTools {
    private final WebDriver wd;
    private final WebDriverWait waiter;

    public DriverTools(WebDriver _wd, WebDriverWait _waiter) {
        wd = _wd;
        waiter = _waiter;
    }

    public void startPage() {
        wd.get(ApplicationManager.config.url + "/wp-admin");
    }

    public void close() {
        wd.close();
    }

    public void quite() {
        wd.quit();
    }
}
