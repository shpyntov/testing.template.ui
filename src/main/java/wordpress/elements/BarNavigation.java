package wordpress.elements;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import wordpress.PageObject;

public class BarNavigation extends PageObject {

    public BarNavigation(RemoteWebDriver _wd, WebDriverWait _waiter) {
        super(_wd, _waiter);
    }
}
