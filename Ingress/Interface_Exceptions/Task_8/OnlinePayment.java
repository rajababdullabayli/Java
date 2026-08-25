package Task_8;

public class OnlinePayment implements Payment {
    private double amount;

    public OnlinePayment() {
        this.amount = amount;
    }

    public void process(double amount) throws IllegalAccessException{
        if (amount<0){
            throw new IllegalAccessException("Amount 0 dan kiçik ola bilməz");
        }
        if (amount>10000){
            System.out.println("Online limiti aşıldı ");
        }
    }
}
