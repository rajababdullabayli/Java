package Task_2;

public class Main {
    static void main(String[] args) {
        TransactionService transactionService = new TransactionService();
        CustomerService customerService = new CustomerService();
        System.out.println(transactionService.getFirstTransaction());

        transactionService.addTransaction(new Transaction(1, "DEPOSIT", 500));
        transactionService.addTransaction(new Transaction(2, "WITHDRAW", 100));
        transactionService.addTransaction(new Transaction(3, "TRANSFER", 250));
        transactionService.addTransaction(new Transaction(4, "DEPOSIT", 1000));
        transactionService.addTransaction(new Transaction(5, "WITHDRAW", 50));

        transactionService.removeFirstTransaction();
        transactionService.removeLastTransaction();

        for (Transaction transaction : transactionService.getTransactions()) {
            System.out.println(transaction);
        }

        customerService.addCustomer(new Customer(101, "Ali", "+994501111111"));
        customerService.addCustomer(new Customer(102, "Vali", "+994502222222"));
        customerService.addCustomer(new Customer(103, "Aysel", "+994503333333"));
        customerService.addCustomer(new Customer(104, "Leyla", "+994504444444"));
        customerService.addCustomer(new Customer(105, "Elvin", "+994505555555"));

        Customer foundCustomer = customerService.findCustomerById(999);
        System.out.println(foundCustomer);
        customerService.removeCustomerById(102);

        for (Customer customer : customerService.getCustomers()) {
            System.out.println(customer);
        }
        transactionService.removeFirstTransaction();
        transactionService.removeFirstTransaction();
        transactionService.removeFirstTransaction();
        transactionService.removeFirstTransaction();
        transactionService.removeFirstTransaction();
        transactionService.removeFirstTransaction();

    }
}
