package wordpress.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import wordpress.PageObject;

public class BarHeader extends PageObject {

    public BarHeader(WebDriver _wd, WebDriverWait _waiter) {
        super(_wd, _waiter);
    }

    public boolean checkAccountIsLogin() {
        return wd.findElements(BarHeaderLocators.account).size() != 0;
    }
}
