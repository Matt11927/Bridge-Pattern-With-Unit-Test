package UserPaymentsOptions;

import PaymentNotificationRequest.Notification;

public class CashPayment extends Payment {

    public CashPayment(Notification channel){
        super(channel);
    }

    @Override
    public String processPayment() {
        String paymentMessage = "To complete your payment prepare cash upon delivery, ";
        return notification.sendNotification(paymentMessage);
    }
}
