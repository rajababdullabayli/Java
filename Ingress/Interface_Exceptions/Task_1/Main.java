package Task_1;

public class Main {
    static void main(String[] args) {
        PaymentService cardPayment = new CardPayment();
        PaymentService cashPayment = new CashPayment();

        cardPayment.pay(100);
        cashPayment.pay(100);
    }
}
