package conventions;

public class Convention {

    private Type type;

    enum Type {
        PACKAGES, CLASSES, VARIABLES, IDENTATION
    }

    public Convention(Type conventionType) {
        this.type = conventionType;
        System.out.println(this.toString() + " created");
    }

    public int showSpentTimePerClass() {
        int timeSpent = 0;
        switch (type) {
            case PACKAGES: timeSpent = 1; break;
            case CLASSES: timeSpent = 1; break;
            case VARIABLES: timeSpent = 1; break;
            case IDENTATION: timeSpent = 1; break;
        }

        System.out.println("Time spent in " + type.name() + " is " + timeSpent);
        return timeSpent;
    }
}
