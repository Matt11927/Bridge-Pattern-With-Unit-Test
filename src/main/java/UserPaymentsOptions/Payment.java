package UserPaymentsOptions;

import PaymentNotificationRequest.Notification;

public abstract class Payment {
    protected Notification notification;

    public Payment(Notification channel) {
        notification = channel;
    }

    abstract public String processPayment();
}
