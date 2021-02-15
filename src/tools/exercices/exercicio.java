package tools.exercices;

import java.util.ArrayList;
import java.util.List;

public class exercicio {

    public static void main(String[] args) {

        int soma = 0;

        List<Integer> integerList = new ArrayList();
        integerList.add(3);
        integerList.add(6);
        integerList.add(9);
        integerList.add(12);
        integerList.add(15);

        for(int i = 0; i < integerList.size(); i++) {
            soma = integerList.get(i);
        }
        System.out.println(soma);
    }
}
