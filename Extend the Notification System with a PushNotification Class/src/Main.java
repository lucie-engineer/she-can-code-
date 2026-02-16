//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    NotificationService emailnot = new EmailNotification();
    NotificationService smsnot = new SMSNotification();
    PushNotification notification = new PushNotification("device123");

    emailnot.sendNotification(" your email has been sent");
    smsnot.sendNotification("your sms has been sent");



        notification.setDefaultPriority("High");
        notification.sendNotification("You have a new push notification.");

    }
}