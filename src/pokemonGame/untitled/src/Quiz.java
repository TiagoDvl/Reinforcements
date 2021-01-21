package pokemonGame.untitled.src;

public class Quiz {

    public int wrongAnswersCounter;
    public int correctAnswersCounter;

    public quiz() {
        String[] questions = {
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                "",
                ""


        };

    }


    public void results() {

        if (correctAnswersCounter > wrongAnswersCounter) {
            System.out.println("Are you sure are a Pokemon fan!?!?");
            System.out.println("Did you watch pokemon as kid?");
        }
        else{
            System.out.println("congratulations looks like you are in fact a pokemon fan!!!");
            System.out.println("what you got them all down ??? jezz...i see you have been doing your homework!");
        }

    }
}
