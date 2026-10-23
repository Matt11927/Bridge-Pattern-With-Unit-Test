package PaymentNotificationRequest;

public class SmsChannel implements Notification{

    @Override
    public String sendNotification(String message) {
        return "Your Payment Confirmation has been sent through Text";
    }
}
