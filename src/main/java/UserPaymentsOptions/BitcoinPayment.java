package UserPaymentsOptions;

import PaymentNotificationRequest.Notification;

public class BitcoinPayment extends Payment{


    public BitcoinPayment(Notification channel){
        super(channel);
    }


    @Override
    public String processPayment() {
        String paymentMessage = "Bit coin payment received, ";
        return null;
    }
}
