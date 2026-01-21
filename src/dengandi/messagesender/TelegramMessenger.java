package dengandi.messagesender;

public class TelegramMessenger implements Messenger {

    @Override
    public void send(String message) {
        System.out.println("[Telegram] Sending: " + message);
    }
}
