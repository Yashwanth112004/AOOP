public class Main {
    public static void main(String[] args) {
        CustomerDatabase database = new CustomerDatabase();

        database.addCustomer(new Customer(101, "Sanjeev", 5000.50));
        database.addCustomer(new Customer(103, "Kailash", 3000.75));
        database.addCustomer(new Customer(102, "Yashwanth", 7000.20));

        System.out.println("Customers (sorted by ID):");
        database.sortById();
        database.displayCustomers();

        System.out.println("\nCustomers (sorted by Name):");
        database.sortByName();
        database.displayCustomers();

        System.out.println("\nCustomers (sorted by Balance):");
        database.sortByBalance();
        database.displayCustomers();

        try {
            Customer clonedCustomer = database.cloneCustomer(new Customer(104, "David", 9000.00));
            System.out.println("\nCloned Customer: " + clonedCustomer);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("\nIterating through Customers:");
        for (Customer customer : database) {
            System.out.println(customer);
        }
    }
}
