package Task_8;

 public class CashPayment implements Payment {
     private double amount;
     public CashPayment() {
         this.amount = amount;
     }
     public void process(double amount) throws IllegalAccessException{
        if (amount<0){
            throw new IllegalAccessException("Amount 0 dan kiçik ola bilməz");
        }
        if (amount>3000){
            System.out.println("Nağd ödəniş limiti aşıldı ");
        }
    }
}
