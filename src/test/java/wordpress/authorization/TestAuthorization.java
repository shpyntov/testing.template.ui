package wordpress.authorization;

import fixtures.BasicTest;
import org.junit.jupiter.api.*;


public class TestAuthorization extends BasicTest{

    @Test
    @DisplayName("Авторизация пользователя.")
    public void testAuth() {
        pages.authorization.actionSignIn();
        Assertions.assertTrue(pages.barHeader.checkAccountIsLogin());
    }

    @Test
    @DisplayName("Пользователь не авторизован.")
    public void testUnAuth() {
        Assertions.assertTrue(pages.barHeader.checkAccountIsNotLogin());
    }

    @Test
    @DisplayName("Выход пользователя из профиля.")
    public void testAuthAndUnAuth() {
        pages.authorization.actionSignIn();
        Assertions.assertTrue(pages.barHeader.checkAccountIsLogin());
        pages.barHeader.actionLogOut();
    }
}
