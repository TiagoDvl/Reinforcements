package tools.exercices.supermarket;

public enum PaymentMethod {

    CASH(1), CARD(5), PAYPAL(50);
   int price;

   PaymentMethod(int p) {
       price = p;
   }
}
