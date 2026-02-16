public class PushNotification implements NotificationService{
    private String deviceId;

    public PushNotification(String deviceId){
        this.deviceId= deviceId;
    }
    @Override
    public void sendNotification(String message){
        System.out.println("Sending Push Notification to deviceId " + deviceId + " : " + message);

    }
    @Override
    public void setDefaultPriority(String priority) {
        System.out.println("Push Notification default priority set to: " + priority);
    }

}
