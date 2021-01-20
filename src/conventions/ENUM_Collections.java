package conventions;

public class ENUM_Collections {

    private Steps steps;

    enum Steps {
        ENUM, ARRAYS_LIST, SET, MAP, EXERCISE
    }

    public ENUM_Collections(Steps enum_Collections) {
        this.steps = enum_Collections;
        System.out.println(this.toString() + " created");
    }

    public int showSpentTimePerClass() {
        int timeSpent = 0;
        switch (steps) {
            case ENUM: timeSpent = 1; break;
            case ARRAYS_LIST: timeSpent = 1; break;
            case SET: timeSpent = 1; break;
            case MAP: timeSpent = 1; break;
            case EXERCISE: timeSpent = 1; break;
        }

        System.out.println("Time spent in " + steps + " is " + timeSpent);
        return timeSpent;
    }
}
