package authorization;

import fixtures.BasicTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestUnAuthorization extends BasicTest {
    @Test
    public void testUnAuth() {
        assertFalse(pages.barHeader.checkAccountIsLogin());
    }
}
