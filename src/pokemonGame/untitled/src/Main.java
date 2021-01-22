import pokeapi.bittle.models.pokemon.Pokemon;
import pokeapi.bittle.models.pokemon.PokemonSpecies;
import pokeapi.bittle.utils.Client;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
        Pokemon pokemon = Client.getPokemonByName("Pikachu");

        Scanner scanner = new Scanner(System.in);
        int correctCounter = 0;
        int totalQuestions = 0;

        System.out.println("Welcome to the Pokemon Quiz!!!\n");
        System.out.println("Do you want to out your Pokemon Knowledge to test???");
        System.out.println("A. YH Lets start this ");
        System.out.println("B. Hmmm im not really sure let me call mammy");

        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("a")) {
            System.out.println("1º question!!!\n");
            System.out.println("-------------------------------------------------------------\n");
            System.out.println("Which evolution does Bulbasaur evolves to?");
            System.out.println("A.Ivysaur");
            System.out.println("B.Venusaur");

            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("a")) {
                System.out.println("CORRECT");
                correctCounter++;
            } else {
                System.out.println("WRONG");
            }
            totalQuestions++;

            System.out.println("2º question!!!\n");
            System.out.println("-------------------------------------------------------------\n");
            System.out.println("How much does Snorlax weighs?");
            System.out.println("A.390.00kg");
            System.out.println("B.460.00Kg");
            System.out.println("C.390.Lbs");
            System.out.println("D.460.00Lbs");

            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("b")) {
                System.out.println("CORRECT");
                correctCounter++;
            } else {
                System.out.println("WRONG");
            }
            totalQuestions++;

            System.out.println("3º question!!!\n");
            System.out.println("-------------------------------------------------------------\n");
            System.out.println("From which generation Marill is?");
            System.out.println("A.2");
            System.out.println("B.1");
            System.out.println("C.3");

            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("a")) {
                System.out.println("CORRECT");
                correctCounter++;
            } else {
                System.out.println("WRONG");
            }
            totalQuestions++;

            System.out.println("4º question!!!\n");
            System.out.println("-------------------------------------------------------------\n");
            System.out.println("How is the Mew trainer in pokemon series?");
            System.out.println("A.Misty");
            System.out.println("B.professor Oak");
            System.out.println("C.jessie of Team Rocket");
            System.out.println("D.Ash Ketchum");

            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("b")) {
                System.out.println("CORRECT");
                correctCounter++;
            } else {
                System.out.println("WRONG");
            }
            totalQuestions++;

            System.out.println("5º question!!!\n");
            System.out.println("-------------------------------------------------------------\n");
            System.out.println("What types is charizard listed as?");
            System.out.println("A.Dragon & flying");
            System.out.println("B.Fire & Dragon");
            System.out.println("C.Fire & Flying");


            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("c")) {
                System.out.println("CORRECT");
                correctCounter++;
            } else {
                System.out.println("WRONG");
            }
            totalQuestions++;

            System.out.println("6º question!!!\n");
            System.out.println("-------------------------------------------------------------\n");
            System.out.println("How is number 1 on the Pokedex?");
            System.out.println("A.Squirtle");
            System.out.println("B.Charmander");
            System.out.println("C.bulbasaur");


            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("c")) {
                System.out.println("CORRECT");
                correctCounter++;
            } else {
                System.out.println("WRONG");
            }
            totalQuestions++;

            System.out.println("7º question!!!\n");
            System.out.println("-------------------------------------------------------------\n");
            System.out.println("What is the Pikachu number on pokedex?");
            System.out.println("A.3");
            System.out.println("B.13");
            System.out.println("C.25");
            System.out.println("D.76");

            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("b")) {
                System.out.println("CORRECT");
                correctCounter++;
            } else {
                System.out.println("WRONG");
            }

            totalQuestions++;
            System.out.println("8º question!!!\n");
            System.out.println("-------------------------------------------------------------\n");
            System.out.println("how many generations exists in the Pokémon universe?");
            System.out.println("A.5");
            System.out.println("B.8");
            System.out.println("C.9");
            System.out.println("D.7");

            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("b")) {
                System.out.println("CORRECT");
                correctCounter++;
            } else {
                System.out.println("WRONG");
            }
            totalQuestions++;

            System.out.println("9º question!!!\n");
            System.out.println("-------------------------------------------------------------\n");
            System.out.println("who is the tallest Pokemom?");
            System.out.println("A.Snorlax");
            System.out.println("B.Dragonite");
            System.out.println("C.Gyarados");
            System.out.println("D.Onix");


            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("c")) {
                System.out.println("CORRECT");
                correctCounter++;
            } else {
                System.out.println("WRONG");
            }
            totalQuestions++;

            System.out.println("10º question!!!\n");
            System.out.println("-------------------------------------------------------------\n");
            System.out.println("What type is Psyduck?");
            System.out.println("A.Water & Psychic");
            System.out.println("B.Psychic");
            System.out.println("C.Water");


            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("c")) {
                System.out.println("CORRECT");
                correctCounter++;
            } else {
                System.out.println("WRONG");

            }
            totalQuestions++;

            System.out.println("11º question!!!\n");
            System.out.println("-------------------------------------------------------------\n");
            System.out.println("What type is Clefairy?");
            System.out.println("A.Ground");
            System.out.println("B.Fairy");
            System.out.println("C.Ground & Fairy");


            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("b")) {
                System.out.println("CORRECT");
                correctCounter++;
            } else {
                System.out.println("WRONG");
            }
            totalQuestions++;

            System.out.println("12º question!!!\n");
            System.out.println("-------------------------------------------------------------\n");
            System.out.println("What is the main Pikachu ability ");
            System.out.println("A.Static");
            System.out.println("B.Motor Drive");
            System.out.println("C.Rivalry");


            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("a")) {
                System.out.println("CORRECT");
                correctCounter++;
            } else {
                System.out.println("WRONG");
            }
            totalQuestions++;

            System.out.println("13º question!!!\n");
            System.out.println("-------------------------------------------------------------\n");


            double score = (100.0 * correctCounter) / totalQuestions;
            System.out.println("You scored " + score + " %");
            if (score <= 25) {
                System.out.println("Are you sure you are a Pokemon fan?!?!");
            }
            if (score > 25 && score <= 50) {
                System.out.println("Not bad to be honest but could be better if saw the all series!!!");

            }
            if (score > 50 && score <= 75) {
                System.out.println("NICE!!! i see you have been doing your homework XD");
            }
            if (score > 75 && score < 100) {
                System.out.println("WOW so close..but either way really good job you are a serious Pokemn fan!!!");

            }
            if (score == 100) {
                System.out.println("JEEZ all correct you ma man... you know your stuff!!!");
            }
        }
        else {
            System.out.println("just sad mate, come back when you find some courage!");
        }
    }
}
