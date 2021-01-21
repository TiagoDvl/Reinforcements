package shared.classes;

public class ClassBeta {

    public static void main(String[] args) {
        int island[] = new int[] {1, 2, 3};
        int islandSize = island.length;

        while (islandSize > 0) {
            System.out.println(island[islandSize - 1]);
            islandSize--;
        }

        ClassAlfa classAlfa = new ClassAlfa(1, "B");
        classAlfa.showClassAlfaStatements();
    }
}
