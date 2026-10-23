import PaymentNotificationRequest.EmailChannel;
import PaymentNotificationRequest.Notification;
import PaymentNotificationRequest.PushChannel;
import PaymentNotificationRequest.SmsChannel;
import UserPaymentsOptions.OnlinePayment;
import UserPaymentsOptions.Payment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPayment {

    @Test
    public void TestOnlinePaymentViaEmail() {
        Notification email = new EmailChannel();
        Payment onlinePayment = new OnlinePayment(email);
        String actual = onlinePayment.processPayment();
        String expected = "Your online payment has been processed, Confirmation has been to your email";
        assertEquals(expected,actual);
    }
    @Test
    public void TestOnlinePaymentViaSms() {
        Notification sms = new SmsChannel();
        Payment onlinePayment = new OnlinePayment(sms);
        String actual = onlinePayment.processPayment();
        String expected = "Your online payment has been processed, you will receive a confirmation text message soon";
        assertEquals(expected,actual);
    }

    @Test
    public void TestOnlinePaymentViaPush() {
        Notification push = new PushChannel();
        Payment onlinePayment = new OnlinePayment(push);
        String actual = onlinePayment.processPayment();
        String expected = "Your online payment has been processed, Your order has been Confirmed";
        assertEquals(expected,actual);
    }


}
