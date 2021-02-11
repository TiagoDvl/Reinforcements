package tools.exercices.supermarket;

import java.util.concurrent.TimeUnit;

public class Cashier {

    private Customer currentCustomer;

    public Cashier(Customer customer) { currentCustomer = customer; }

    public void checkout(PaymentMethod paymentMethod) {

        for (int i = 0; i < 3; i++) {
            switch(i) {
                case 0:
                    System.out.println("cashier: Good evening Sir!");

                    System.out.println("cash register: pi...pi...pi..pi... ");

                    break;
                case 1:
                    System.out.println("cashier: it will be " + currentCustomer.getDebt());

                    System.out.println("cashier: Are you paying cash or card ?");


                    break;
            }
        }

        switch (paymentMethod) {
            case CASH:
                System.out.println("customer: I'll pay cash !");
                break;

            case CARD:
                System.out.println("customer: I'll pay card !");
                break;

            case PAYPAL:
                System.out.println("customer: I'll pay paypal !");
                break;

        }


        // Customer should be charged for his debt.
        // 1 - Create 3 possible payment methods
        // 2 - Add a way to add mor debt to a Customer
        // 3 - Create a condition to each payment method to pay customer debt.

    }
}
