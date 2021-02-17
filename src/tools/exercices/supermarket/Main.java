package tools.exercices.supermarket;

public class Main {

    public static void main(String[] args) {

        // A new customer enters the supermarket.
        Customer customer = new Customer("Tiago");

        // Customer goes through the shopping picking items
        customer.addDebt(11);
        customer.addDebt(22);
        customer.addDebt(33);
        customer.addDebt(44);

        // User goes to the till in order to know how much it is owing
        Cashier cashier = new Cashier(customer);

        // Pays his debts
        cashier.checkout(PaymentMethod.CARD);
    }
}
