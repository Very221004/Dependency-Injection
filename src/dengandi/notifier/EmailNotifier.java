package dengandi.notifier;

public class EmailNotifier implements Notifier {

    @Override
    public void notifyUser(String name) {
        System.out.println("Sending email to " + name);
    }
}
