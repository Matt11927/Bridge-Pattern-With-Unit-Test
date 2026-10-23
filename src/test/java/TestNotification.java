import PaymentNotificationRequest.EmailChannel;
import PaymentNotificationRequest.Notification;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestNotification {



    @Test
        public void TestEmailNotify() {
         Notification email = new EmailChannel();
            String actual = email.getPaymentNotification(null);
            String expected = "Your Payment Confirmation has been sent via email";
            assertEquals(expected,actual);
        }


}
