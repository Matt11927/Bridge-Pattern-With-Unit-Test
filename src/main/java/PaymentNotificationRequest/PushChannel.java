package PaymentNotificationRequest;

public class PushChannel implements Notification{
    @Override
    public String sendNotification(String message) {
        return "Your Payment Confirmation has been sent through PUSH";
    }
}
