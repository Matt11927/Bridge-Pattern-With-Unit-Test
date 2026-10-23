import PaymentNotificationRequest.EmailChannel;
import PaymentNotificationRequest.Notification;
import PaymentNotificationRequest.PushChannel;
import PaymentNotificationRequest.SmsChannel;
import UserPaymentsOptions.BitcoinPayment;
import UserPaymentsOptions.CashOnDeliveryPayment;
import UserPaymentsOptions.OnlinePaymentNotification;
import UserPaymentsOptions.Payment;
public class Main {

    public static void main (String[] arg){

        Notification email = new EmailChannel();
        Notification sms = new SmsChannel();
        Notification push = new PushChannel();


        Payment onlineEmailPayment = new OnlinePaymentNotification(email);
        String processedOnlineEmailPayment = onlineEmailPayment.processPayment();
        System.out.println("\nCustomer 1 Decided pay with Card and get an email: ");
        System.out.println(processedOnlineEmailPayment + "\n");


        Payment onlineSmsPayment = new OnlinePaymentNotification(sms);
        String processedOnlineSmsPayment = onlineSmsPayment.processPayment();
        System.out.println("Customer 2 Decided pay with Card and get an text: ");
        System.out.println(processedOnlineSmsPayment + "\n");


        Payment cashEmailPayment = new CashOnDeliveryPayment(email);
        String processedCashEmailPayment = cashEmailPayment.processPayment();
        System.out.println("Customer 3 Decided pay with cash and get an email: ");
        System.out.println(processedCashEmailPayment + "\n");


        Payment cashSmsPayment = new CashOnDeliveryPayment(sms);
        String processedCashSmsPayment = cashSmsPayment.processPayment();
        System.out.println("Customer 4 Decided pay with cash and get an text: ");
        System.out.println(processedCashSmsPayment + "\n");


        Payment bitCoinEmailPayment = new BitcoinPayment(email);
        String processedBitCoinEmailPayment = bitCoinEmailPayment.processPayment();
        System.out.println("Customer 5 Decided pay with bit coin and get an email: ");
        System.out.println(processedBitCoinEmailPayment + "\n");


        Payment bitCoinSmsPayment = new BitcoinPayment(sms);
        String processedBitCoinSmsPayment = bitCoinSmsPayment.processPayment();
        System.out.println("Customer 6 Decided pay with bit coin and get an text: ");
        System.out.println(processedBitCoinSmsPayment + "\n");

    }
}
