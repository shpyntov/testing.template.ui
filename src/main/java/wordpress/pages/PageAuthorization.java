package wordpress.pages;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import wordpress.PageObject;


public class PageAuthorization extends PageObject {
    public PageAuthorization(WebDriver _wd, WebDriverWait _waiter) {
        super(_wd, _waiter);
    }

    // ACTION

    @Step("Авторизация.")
    public void actionSignIn(String email, String password) {
        insertLogin(email);
        insertPassword(password);
        clickLogin();
    }

    // INSERT

    @Step("Ввод пароля.")
    public void insertPassword(String password) {
        waitElement(PageAuthorizationLocators.inputPassword).sendKeys(password);
        Allure.attachment("Пароль", password);
    }

    @Step("Ввод логина.")
    public void insertLogin(String email) {
        waitElement(PageAuthorizationLocators.inputEmail).sendKeys(email);
        Allure.attachment("Логин", email);
    }

    // CLICK

    @Step("Нажатие на кнопку 'Войти'.")
    public void clickLogin() {
        waitElement(PageAuthorizationLocators.buttonSubmit).click();
    }
}
