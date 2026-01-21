package tanpadi.notifier;

public class UserService {

    public void registerUser(String name) {
        System.out.println("User registered: " + name);

        // Hardcoded: selalu kirim email
        System.out.println("Sending email to " + name);
    }
}
