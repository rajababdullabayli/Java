package Task_5;

public class EmailNotification implements Notification {
    public void send(String message){
        System.out.println("Email göndərildi: "+message);
    }
}
