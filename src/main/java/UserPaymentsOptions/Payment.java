package UserPaymentsOptions;

import PaymentNotificationRequest.Notification;

public abstract class Payment {
    protected Notification notification;
    abstract public String processPayment(Notification notification);
}
