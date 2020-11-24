package fixtures;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverManager;
import wordpress.PageClient;

public class BasicTest {
    protected static PageClient pages;

    @BeforeAll
    public static void setUp()
    {
        WebDriver wd = DriverManager.createDriver();
        pages = new PageClient(wd, new WebDriverWait(wd, 10));
        pages.wdTools.startPage();
    }


}
