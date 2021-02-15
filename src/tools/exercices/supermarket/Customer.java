package tools.exercices.supermarket;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    private int debt;
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public int getDebt() {
      return debt;
    }

    public void amountDebt() {
        List<Integer> customerDebt = new ArrayList();
        customerDebt.add(11);
        customerDebt.add(22);
        customerDebt.add(33);
        customerDebt.add(44);


        for (int i = 0; i < customerDebt.size(); i++) {
            debt = debt + customerDebt.get(i);
        }
    }

    public void setDebt(int debt) {
        this.debt = debt;
    }
}
