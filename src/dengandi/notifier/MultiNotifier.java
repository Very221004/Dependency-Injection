package dengandi.notifier;

public class MultiNotifier implements Notifier {

    @Override
    public void notifyUser(String name) {
        System.out.println("Sending email to " + name);
        System.out.println("Sending SMS to " + name);
    }
}
