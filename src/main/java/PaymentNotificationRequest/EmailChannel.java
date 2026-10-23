package PaymentNotificationRequest;

public class EmailChannel implements Notification{

    @Override
    public String sendNotification(String message) {
        return message + "Confirmation has been sent to your email";
    }
}
