public class MainApp {
    public static void main(String[] args) {
        LoginService service = new LoginService();

        System.out.println("Admin login: " +
                service.validateLogin("admin", "1234"));

        System.out.println("User login: " +
                service.validateLogin("user", "pass"));

        System.out.println("Invalid login: " +
                service.validateLogin("abc", "wrong"));
    }
}