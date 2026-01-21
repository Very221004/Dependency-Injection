package dengandi.messagesender;

public class WhatsAppMessenger implements Messenger {

    @Override
    public void send(String message) {
        System.out.println("[WhatsApp] Sending: " + message);
    }
}
