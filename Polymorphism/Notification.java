
class Notifier {

    public void send(String message) {
        System.out.println("General Notification: " + message);
    }
    protected void send(String message, String email) {
        System.out.println("Email sent to " + email + ": " + message);
    }
    void send(String message, long phone) {
        System.out.println("SMS sent to " + phone + ": " + message);
    }

    // Private method (hidden)
    private void send(String message, String email, long phone) {
        System.out.println("Internal Notification (Email + SMS): " + message);
    }

    // Public method to access private method
    public void accessPrivate(String message, String email, long phone) {
        send(message, email, phone); // calling private method
    }
}


class AppNotifier extends Notifier {

    public void useMethods() {


        send("Hello User"); // public
        send("Hello Email", "user@gmail.com"); // protected
        send("Hello SMS", 9876543210L); // default


    }
}


public class Notification {
    public static void main(String[] args) {

        AppNotifier app = new AppNotifier();

        // Demonstrating method overloading
        app.send("Only message");
        app.send("Message + Email", "abc@gmail.com");
        app.send("Message + Phone", 9999999999L);

        System.out.println("-------------");

        app.useMethods();
    }
}