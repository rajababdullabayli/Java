package Task_1;

public class CardPayment implements PaymentService {
    private double amount;

    public CardPayment() {
        this.amount = amount;
    }

    public void pay(double amount){
        System.out.println("Kartla ödəniş: "+amount+" AZN");
    }
}
