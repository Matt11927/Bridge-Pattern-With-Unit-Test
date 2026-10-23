package UserPaymentsOptions;

import PaymentNotificationRequest.Notification;

public class OnlinePaymentNotification extends Payment{

    public OnlinePaymentNotification(Notification channel) {
        super(channel);
    }

    @Override
    public String processPayment() {
        String paymentMessage = "Your credit card or PayPal payment was successful, ";
        return notification.sendNotification(paymentMessage);
    }
}
