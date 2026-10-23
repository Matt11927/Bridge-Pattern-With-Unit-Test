package PaymentNotificationRequest;

public class PushChannel implements Notification{
    @Override
    public String getPaymentNotification() {
        return "Your Payment Confirmation has been sent through PUSH";
    }
}
