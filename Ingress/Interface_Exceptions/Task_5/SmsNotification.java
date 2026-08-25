package Task_5;

public class SmsNotification implements Notification{
    public void send(String message){
        System.out.println("SMS göndərildi: "+message);
    }
}
