import PaymentNotificationRequest.EmailChannel;
import PaymentNotificationRequest.Notification;
import PaymentNotificationRequest.PushChannel;
import PaymentNotificationRequest.SmsChannel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestNotifications {



    @Test
        public void TestEmailNotify() {
         Notification email = new EmailChannel();
            String actual = email.getPaymentNotification();
            String expected = "Your Payment Confirmation has been sent via email";
            assertEquals(expected,actual);
        }
    @Test
        public void TestSmsNotify(){
        Notification sms = new SmsChannel();
        String actual = sms.getPaymentNotification();
        String expected ="Your Payment Confirmation has been sent through Text";
        assertEquals(expected,actual);
    }
    @Test
    public void TestPushNotify(){
        Notification push = new PushChannel();
        String actual = push.getPaymentNotification();
        String expected ="Your Payment Confirmation has been sent through PUSH";
        assertEquals(expected,actual);
    }



}
