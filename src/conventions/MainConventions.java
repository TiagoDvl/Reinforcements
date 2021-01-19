package conventions;

import jdk.swing.interop.SwingInterOpUtils;

public class MainConventions {

    public static void main(String[] args) {

        System.out.println("Primeira aula");
        System.out.println("Git is fucking important");
        System.out.println("I believe him i saying the truth!!!");

        Convention convention = new Convention(Convention.Type.CLASSES);
        convention.showSpentTimePerClass();

        for (Convention.Type type : Convention.Type.values()) {
            System.out.println("The topic in the convention section is " + type.name());
        }
    }
}
