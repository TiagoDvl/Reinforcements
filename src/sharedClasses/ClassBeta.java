package sharedClasses;

public class ClassBeta {

    public static void main(String[] args) {
        int Island[] = new int[] {1, 2,3};
        int Islandsize = Island.length;
        while (Islandsize>0)
        {
            System.out.println(Island[Islandsize-1]);
            Islandsize--;
        }

        Classalfa classalfa = new Classalfa(1, "B");
        classalfa.Showclassalfastatements();
    }
}
