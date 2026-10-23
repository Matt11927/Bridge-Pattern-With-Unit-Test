import PaymentNotificationRequest.EmailChannel;
import PaymentNotificationRequest.Notification;
import PaymentNotificationRequest.PushChannel;
import PaymentNotificationRequest.SmsChannel;
import UserPaymentsOptions.CashOnDeliveryPayment;
import UserPaymentsOptions.OnlinePaymentNotification;
import UserPaymentsOptions.Payment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPaymentNotification {

    @Test
    public void TestOnlinePaymentViaEmail() {
        Notification email = new EmailChannel();
        Payment onlinePayment = new OnlinePaymentNotification(email);
        String actual = onlinePayment.processPayment();
        String expected = "Your credit card or PayPal payment was successful, Confirmation has been sent to your email";
        assertEquals(expected,actual);
    }
    @Test
    public void TestOnlinePaymentViaSms() {
        Notification sms = new SmsChannel();
        Payment onlinePayment = new OnlinePaymentNotification(sms);
        String actual = onlinePayment.processPayment();
        String expected = "Your credit card or PayPal payment was successful, you will receive a confirmation text message soon";
        assertEquals(expected,actual);
    }

    @Test
    public void TestOnlinePaymentViaPush() {
        Notification push = new PushChannel();
        Payment onlinePayment = new OnlinePaymentNotification(push);
        String actual = onlinePayment.processPayment();
        String expected = "Your credit card or PayPal payment was successful, Your order has been Confirmed";
        assertEquals(expected,actual);
    }

    @Test
    public void TestCashPaymentViaEmail(){
        Notification email = new EmailChannel();
        Payment cashPayment = new CashOnDeliveryPayment(email);
        String actual = cashPayment.processPayment();
        String expected = "To complete your payment prepare cash upon delivery, Confirmation has been sent to your email";
        assertEquals(expected,actual);
    }

    @Test
    public void TestCashPaymentViaSms(){
        Notification sms = new SmsChannel();
        Payment cashPayment = new CashOnDeliveryPayment(sms);
        String actual = cashPayment.processPayment();
        String expected = "To complete your payment prepare cash upon delivery, you will receive a confirmation text message soon";
        assertEquals(expected,actual);
    }

    @Test
    public void TestCashPaymentViaPush(){
        Notification push = new PushChannel();
        Payment cashPayment = new CashOnDeliveryPayment(push);
        String actual = cashPayment.processPayment();
        String expected = "To complete your payment prepare cash upon delivery, Your order has been Confirmed";
        assertEquals(expected,actual);
    }


}
