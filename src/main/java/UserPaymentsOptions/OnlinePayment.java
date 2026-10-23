package UserPaymentsOptions;

import PaymentNotificationRequest.Notification;

public class OnlinePayment extends Payment{

    public OnlinePayment(Notification channel) {
        super(channel);
    }

    @Override
    public String processPayment() {
        String paymentMessage = "Your online payment has been processed, ";
        return notification.sendNotification(paymentMessage);
    }
}
