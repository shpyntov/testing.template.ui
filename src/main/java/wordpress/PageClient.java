package wordpress;

import common.DriverTools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import wordpress.elements.BarHeader;
import wordpress.pages.PageAuthorization;

public class PageClient {

    public DriverTools wdTools;
    public BarHeader barHeader;
    public PageAuthorization authorization;

    public PageClient(WebDriver _wd, WebDriverWait _waiter)
    {
        authorization = new PageAuthorization(_wd, _waiter);
        barHeader  = new BarHeader(_wd, _waiter);
        wdTools = new DriverTools(_wd, _waiter);
    }
}
