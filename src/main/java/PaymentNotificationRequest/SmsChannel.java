package PaymentNotificationRequest;

public class SmsChannel implements Notification{

    @Override
    public String sendNotification(String message) {
        return message + "you will receive a confirmation text message soon";
    }
}
