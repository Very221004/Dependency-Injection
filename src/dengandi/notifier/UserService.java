package dengandi.notifier;

public class UserService {

    private Notifier notifier;

    // Dependency di-inject lewat constructor
    public UserService(Notifier notifier) {
        this.notifier = notifier;
    }

    public void registerUser(String name) {
        System.out.println("User registered: " + name);
        notifier.notifyUser(name);
    }
}
