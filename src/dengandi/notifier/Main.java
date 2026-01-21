package dengandi.notifier;

public class Main {
    public static void main(String[] args) {

        // Pakai Email
        UserService service1 = new UserService(new EmailNotifier());
        service1.registerUser("John");
        System.out.println();

        // Pakai SMS
        UserService service2 = new UserService(new SmsNotifier());
        service2.registerUser("Jane");
        System.out.println();

        // Pakai Both
        UserService service3 = new UserService(new MultiNotifier());
        service3.registerUser("Bob");
    }
}
