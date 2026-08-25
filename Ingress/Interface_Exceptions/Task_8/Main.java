package Task_8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Payment> payments = new ArrayList<>();

        CardPayment cardPayment = new CardPayment();
        CashPayment cashPayment = new CashPayment();
        OnlinePayment onlinePayment = new OnlinePayment();

        try {
            cardPayment.process(4000);
        } catch (IllegalAccessException e) {
            System.out.println("Xəta");
        }

        try {
            cashPayment.process(5000);
        } catch (IllegalAccessException e) {
            System.out.println("Xəta");
        }

        try {
            onlinePayment.process(5000);
        } catch (IllegalAccessException e) {
            System.out.println("Xəta");
        }
    }
}
