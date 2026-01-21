package dengandi.messagesender;

public class MessageSender {

    private Messenger messenger; // abstraction, bukan concrete class

    // Dependency di-inject lewat constructor
    public MessageSender(Messenger messenger) {
        this.messenger = messenger;
    }

    public void sendMessage(String message) {
        messenger.send(message);
    }
}
