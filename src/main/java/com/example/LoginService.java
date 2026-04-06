public class LoginService {

    // Dummy credentials (can replace with DB later)
    public boolean validateLogin(String username, String password) {

        if (username == null || password == null) {
            return false;
        }

        // Trim spaces
        username = username.trim();
        password = password.trim();

        // Basic validation
        if (username.isEmpty() || password.isEmpty()) {
            return false;
        }

        // Hardcoded users
        if (username.equals("admin") && password.equals("1234")) {
            return true;
        }

        if (username.equals("user") && password.equals("pass")) {
            return true;
        }

        return false;
    }
}