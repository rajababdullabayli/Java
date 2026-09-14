package Task_2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CustomerService {
    private Map<Integer, Customer> customers = new HashMap<>();

    public void addCustomer(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    public Customer findCustomerById(int id) {
        return customers.get(id);
    }

    public void removeCustomerById(int id) {
        if (customers.containsKey(id)) {
            customers.remove(id);
        }
    }

    public Collection<Customer> getCustomers() {
        return customers.values();
    }
}
