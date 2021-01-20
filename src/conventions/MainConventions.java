package conventions;

import jdk.swing.interop.SwingInterOpUtils;

public class MainConventions {

    public static void main(String[] args) {

        System.out.println("Primeira aula");
        System.out.println("Git is fucking important");
        System.out.println("I believe him, he is saying the truth!!!");

        System.out.println("\n");

        Convention convention = new Convention(Convention.Type.CLASSES);
        Convention convention2 = new Convention(Convention.Type.GIT);
        convention.showSpentTimePerClass();
        convention2.showSpentTimePerClass();

        System.out.println("\n");

        ENUM_Collections enum_collections = new ENUM_Collections(ENUM_Collections.Steps.ENUM);
        enum_collections.showSpentTimePerClass();

        for (ENUM_Collections.Steps steps : ENUM_Collections.Steps.values()) {
            System.out.println("The topic in the ENUM_Collections section is " + steps.name());
        }
        System.out.println("\n");

        for (Convention.Type type : Convention.Type.values()) {
            System.out.println("The topic in the convention section is " + type.name());
        }
    }
}
