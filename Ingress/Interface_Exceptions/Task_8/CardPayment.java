package Task_8;

public class CardPayment implements Payment{
    private double amount;

    public CardPayment() {
        this.amount = amount;
    }

    public void process(double amount) throws IllegalAccessException {
        if (amount<0){
            throw new IllegalAccessException("Amount 0 dan kiçik ola bilməz");
        }
        if (amount>5000){
            System.out.println("Kart limiti aşıldı ");
        }
    }
}
