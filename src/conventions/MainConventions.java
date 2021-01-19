package conventions;

import jdk.swing.interop.SwingInterOpUtils;

public class MainConventions {

    public static void main(String[] args) {

        System.out.println("Primeira aula");
        System.out.println("Git is fucking important");
        System.out.println("I believe him i saying the truth!!!");

       Convention convention = new Convention("packages","Classes","Variables","Identation");
        System.out.println("the first topic in the convenction section is " + convention.topico1);
        System.out.println("the second topic in the convenction section is " + convention.topico2);
        System.out.println("the third topic in the convenction section is " + convention.topico3);
        System.out.println("the fourth topic in the convenction section is " + convention.topico4);
    }
}
