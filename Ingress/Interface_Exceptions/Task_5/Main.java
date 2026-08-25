package Task_5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        String message = "Salam";
        List<Notification> notifications = new ArrayList<>();
        Notification emailNotification = new EmailNotification();
        Notification smsNotification = new SmsNotification();
        Notification pushNotification = new PushNotification();

        notifications.add(emailNotification);
        notifications.add(smsNotification);
        notifications.add(pushNotification);

        for (Notification notification : notifications){
            notification.send(message);
        }
    }
}
