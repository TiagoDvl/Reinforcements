package tools.exercices.supermarket;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Customer customer = new Customer("Tiago");
        customer.setDebt(25);
        Cashier cashier = new Cashier(customer);
       cashier.checkout(PaymentMethod.CARD);


    }
}
