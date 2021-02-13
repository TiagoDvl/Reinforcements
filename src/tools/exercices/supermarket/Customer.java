package tools.exercices.supermarket;

public class Customer {

    private int debt;
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }
}
