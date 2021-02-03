package tools.exercices.supermarket;

public class Cashier {

    private Customer currentCustomer;

    public Cashier(Customer customer) {
        currentCustomer = customer;
    }

    public void checkout(PaymentMethod paymentMethod) {
        // Customer should be charged for his debt.
        // 1 - Create 3 possible payment methods
        // 2 - Add a way to add mor debt to a Customer
        // 3 - Create a condition to each payment method to pay customer debt.
    }
}
