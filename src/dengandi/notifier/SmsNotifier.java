package dengandi.notifier;

public class SmsNotifier implements Notifier {

    @Override
    public void notifyUser(String name) {
        System.out.println("Sending SMS to " + name);
    }
}
