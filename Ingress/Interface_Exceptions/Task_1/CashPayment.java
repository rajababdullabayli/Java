package Task_1;

public class CashPayment implements PaymentService {
    private double amount;

    public CashPayment() {
        this.amount = amount;
    }

    public void pay(double amount){
        System.out.println("Nağd ödəniş: "+amount+" AZN");
    }
}
