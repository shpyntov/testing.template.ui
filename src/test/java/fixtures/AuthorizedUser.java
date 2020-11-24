package fixtures;

import org.junit.jupiter.api.BeforeAll;
import util.ApplicationManager;

public class AuthorizedUser extends BasicTest{
    @BeforeAll
    public static void setUpAuthorized(){
        pages.authorization.actionSignIn(
                ApplicationManager.config.login,
                ApplicationManager.config.password
        );
    }
}
