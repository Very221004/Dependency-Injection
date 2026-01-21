package dengandi.messagesender;

public class Main {
    public static void main(String[] args) {

        // Pakai WhatsApp
        Messenger whatsapp = new WhatsAppMessenger();
        MessageSender sender1 = new MessageSender(whatsapp);
        sender1.sendMessage("Hello via WhatsApp!");

        // Ganti ke Telegram tanpa ubah MessageSender
        Messenger telegram = new TelegramMessenger();
        MessageSender sender2 = new MessageSender(telegram);
        sender2.sendMessage("Hello via Telegram!");
    }
}
