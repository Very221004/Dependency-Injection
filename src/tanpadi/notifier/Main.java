package tanpadi.notifier;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserService();

        userService.registerUser("John");
        System.out.println();

        userService.registerUser("Alice");
        System.out.println();

        userService.registerUser("Bob");
    }
}
