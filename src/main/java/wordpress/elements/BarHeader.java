package wordpress.elements;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import wordpress.PageObject;

public class BarHeader extends PageObject {

    public BarHeader(WebDriver _wd, WebDriverWait _waiter) {
        super(_wd, _waiter);
    }

    @Step("Проверка что пользователь вошел в аккаунт.")
    public boolean checkAccountIsLogin() {
        return wd.findElements(BarHeaderLocators.account).size() != 0;
    }

    @Step("Проверка что пользователь вышел из аккаунта.")
    public boolean checkAccountIsNotLogin() {
        return wd.findElements(BarHeaderLocators.account).size() == 0;
    }

    @Step("Выход из профиля.")
    public void actionLogOut() {

    }
}
