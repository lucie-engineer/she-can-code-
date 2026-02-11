import org.w3c.dom.ls.LSOutput;

public class EmailNotification implements NotificationService {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email Notification: " + message);
    }

}

