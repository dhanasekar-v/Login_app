public class LoginService {

    public boolean validateLogin(String username, String password) {

        if (username == null || password == null) {
            return false;
        }

        username = username.trim();
        password = password.trim();

        if (username.isEmpty() || password.isEmpty()) {
            return false;
        }

        if (username.equals("admin") && password.equals("1234")) {
            return true;
        }

        if (username.equals("user") && password.equals("pass")) {
            return true;
        }

        return false;
    }
}