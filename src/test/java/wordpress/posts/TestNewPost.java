package wordpress.posts;

import fixtures.BasicTest;
import org.junit.jupiter.api.*;


public class TestNewPost extends BasicTest {

    @Test
    @DisplayName("Создание нового поста.")
    public void testNewPost() {
        pages.authorization.actionSignIn();
        pages.barHeader.actionNewPost();
    }
}
