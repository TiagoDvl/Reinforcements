package tools.exercices.supermarket;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    List<Integer> customerDebt = new ArrayList();
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public int getDebt() {
        int totalDebt = 0;

        for (int i = 0; i < customerDebt.size(); i++) {
            totalDebt = totalDebt + customerDebt.get(i);
        }

        return totalDebt;
    }

    public void addDebt(int debt) {
        customerDebt.add(debt);
    }
}
