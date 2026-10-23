package UserPaymentsOptions;

import PaymentNotificationRequest.Notification;

public class CashOnDeliveryPayment extends Payment {

    public CashOnDeliveryPayment(Notification channel){
        super(channel);
    }

    @Override
    public String processPayment() {
        String paymentMessage = "To complete your payment prepare cash upon delivery, ";
        return notification.sendNotification(paymentMessage);
    }
}
