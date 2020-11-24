package wordpress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageObject {
    protected WebDriver wd;
    protected WebDriverWait waiter;

    public PageObject(WebDriver _wd, WebDriverWait _waiter) {
        wd = _wd;
        waiter = _waiter;
    }

    protected WebElement waitElement(By by) {
        return waiter.until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
