import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class CustomerDatabase implements Iterable<Customer> {
    private List<Customer> customers;

    public CustomerDatabase() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void sortById() {
        Collections.sort(customers);
    }

    public void sortByName() {
        customers.sort(new CustomerNameComparator());
    }

    public void sortByBalance() {
        customers.sort(new CustomerBalanceComparator());
    }

    public Customer cloneCustomer(Customer customer) throws CloneNotSupportedException {
        return (Customer) customer.clone();
    }

    public void displayCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    @Override
    public Iterator<Customer> iterator() {
        return customers.iterator();
    }
}
