package PaymentNotificationRequest;

public class SmsChannel implements Notification{

    @Override
    public String getPaymentNotification() {
        return "Your Payment Confirmation has been sent through Text";
    }
}
