package Task_6;

public class Main {
    static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        try {
            bankAccount.withdraw(-100);
        }catch (IllegalAccessException e){
            System.out.println("Xəta: "+e.getMessage());
        }
    }
}
