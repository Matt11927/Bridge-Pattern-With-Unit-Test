package UserPaymentsOptions;

import PaymentNotificationRequest.Notification;

public class OnlinePayment extends Payment{

    @Override
    public String processPayment(Notification channel) {
        String paymentMessage = "Your online payment has been processed.";
        return null;
    }
}
