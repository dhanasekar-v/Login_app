import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginServiceTest {

    LoginService service = new LoginService();

    @Test
    public void testValidLogin() {
        assertTrue(service.validateLogin("admin", "1234"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(service.validateLogin("admin", "wrong"));
    }

    @Test
    public void testInvalidUsername() {
        assertFalse(service.validateLogin("wrong", "1234"));
    }

    @Test
    public void testEmptyFields() {
        assertFalse(service.validateLogin("", ""));
    }

    @Test
    public void testNullInput() {
        assertFalse(service.validateLogin(null, null));
    }

    @Test
    public void testTrimInput() {
        assertTrue(service.validateLogin(" admin ", "1234"));
    }
}