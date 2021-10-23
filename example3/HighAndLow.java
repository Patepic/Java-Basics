import java.util.*;

public class HighAndLow {
	public static void main(String[] args) {
        
        // Declares a random number up to 100
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        
        int guesses = 1;
        int guess = 0;

        Scanner input = new Scanner(System.in);

        // Loop for guesses
        while (guesses <= 5) {
            System.out.print("Guess a number between 0 & 100. Enter guess number "+guesses+": ");
            guess = input.nextInt();

            if (guesses != 5 && guess < randomNumber) {
                System.out.println(guess+" was too low. Guess again.");
            }

            else if (guesses != 5 && guess > randomNumber) {
                System.out.println(guess+" was too high. Guess again.");
            }

            else if (guess == randomNumber || guess != randomNumber && guesses == 5) {
                break;
            }

            guesses++;
        }

        input.close();

        // Prints if guess is correct
        if (guess == randomNumber) {
            System.out.println(guess+" was the random number.");
            System.exit(0);
        }
        // Prints if all guesses are wrong
        System.out.print("The random number was "+randomNumber+". Try again next time.");

    }
}