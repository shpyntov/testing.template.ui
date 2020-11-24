package authorization;

import fixtures.AuthorizedUser;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestAuthorization extends AuthorizedUser {
    @Test
    public void testAuth() {
        assertTrue(pages.barHeader.checkAccountIsLogin());
    }
}
