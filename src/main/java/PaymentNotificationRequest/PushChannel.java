package PaymentNotificationRequest;

public class PushChannel implements Notification{
    @Override
    public String sendNotification(String message) {
        return message + "Push Notification Confirmed";
    }
}
