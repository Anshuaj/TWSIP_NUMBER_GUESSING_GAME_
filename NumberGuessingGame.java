// import java.util.Random;
// import java.util.Scanner;

// public class NumberGuessingGame {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         Random random = new Random();

//         int num_Guess = random.nextInt(11);
//         int Total_Tries = 0;

//         boolean GuessedCorrectly = false;

//         System.out.println("Welcome to the Number Guessing Game!");
        
//         while (!GuessedCorrectly) {
//             System.out.print("Guess a number between 0-10: ");
//             int userGuess = scanner.nextInt();
//             Total_Tries++;

//             if (userGuess < 0 || userGuess > 10) {
//                 System.out.println("Please guess a number within the valid range.");
//             } else if (userGuess < num_Guess) {
//                 System.out.println("Too low! Try again.");
//             } else if (userGuess > num_Guess) {
//                 System.out.println("Too high! Try again.");
//             } else {
//                 GuessedCorrectly = true;
//                 System.out.println("Congratulations! You've guessed the correct number.");
//                 System.out.println("Total No. of Attempts: " + Total_Tries);
//             }
            
//         }
//     scanner.close();
//     }
// }
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game!");

        while (playAgain) {
            int num_Guess = ran.nextInt(11);
            int totalTries = 0;
            boolean guessedCorrectly = false;

            while (!guessedCorrectly) {
                System.out.print("Guess a number between 0-10: ");
                int userGuess = sc.nextInt();
                totalTries++;

                if (userGuess < 0 || userGuess > 10) {
                    System.out.println("Please guess a number within the valid range.");
                } else if (userGuess < num_Guess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > num_Guess) {
                    System.out.println("Too high! Try again.");
                } else {
                    guessedCorrectly = true;
                    System.out.println("Congratulations! You've guessed the correct number.");
                    System.out.println("Total No. of Attempts: " + totalTries);
                }
            }

            System.out.print("Enter 1 to play again, any other number to exit: ");
            int playChoice = sc.nextInt();
            if (playChoice != 1) {
                playAgain = false;
            }
        }
        System.out.println("Thanks for playing!");
        sc.close();
    }
}

