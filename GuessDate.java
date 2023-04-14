package FridayExercises;

import java.util.Random;
import java.util.Scanner;

public class GuessDate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        int myDate = rand.nextInt(31);
        System.out.println(myDate);

        System.out.println("Guess My Day  of Birth: ");
        int guess = input.nextInt();

        while (guess != myDate){
            if (guess > myDate){
                System.out.println(" You guessed too High, Guess Again: ");
                guess =input.nextInt();
            }
           if (guess < myDate){
                System.out.println("yOu guessed too low, Guess Again: ");
                guess =input.nextInt();
            }
            else System.out.println("Congratulations you guessed right: ");
        }
    }
}
