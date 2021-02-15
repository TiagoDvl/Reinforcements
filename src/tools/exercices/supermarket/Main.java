package tools.exercices.supermarket;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Tiago");
        customer.amountDebt();
        Cashier cashier = new Cashier(customer);
        cashier.checkout(PaymentMethod.CARD);
    }
}
