package PaymentNotificationRequest;

public class EmailChannel implements Notification{

    @Override
    public String getPaymentNotification(String message) {
        return "Your Payment Confirmation has been sent via email";
    }
}
