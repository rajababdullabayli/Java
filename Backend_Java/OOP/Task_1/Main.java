package OOP.Task_1;

public class Main {
    static void main(String[] args) {
        BankAccount ba1 = new BankAccount("Rajab","1",2008);
        BankAccount ba2 = new BankAccount("Rasul","2",1234);
        BankAccount ba3 = new BankAccount("Murad","3",4567);

        ba1.deposit(3600.0);
        ba2.deposit(2500.0);
        ba3.deposit(4300.0);
        ba2.deposit(-50);

        ba3.transferTo(ba1,1600.0,4567);
        boolean result = ba2.withdraw(2700.0,1234);
        if (result){
            System.out.println("Successful");
        }
        else {
            System.out.println("Not Successful");
        }

        ba2.checkBalance(9999);
        ba2.withdraw(100, 1111);
        ba2.withdraw(100, 2222);
        ba2.withdraw(100, 3333);

        ba2.deposit(500);

        ba1.applyInterest();
        ba1.printHistory();
        ba2.printHistory();
    }
}
