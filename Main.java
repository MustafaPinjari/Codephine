import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = (int) (Math.random() * 100);
        int maxAttempts = 5; // You can adjust the maximum number of attempts
        int attempts = 0;
        int unum;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess Any Number (1-100) : ");

        while (attempts < maxAttempts) {
            unum = sc.nextInt();
            attempts++;

            if (unum == num) {
                System.out.println("Correct guess! You did it in " + attempts + " attempts.");
                displayScore(attempts);
                break;
            } else if (unum > num) {
                System.out.println("Your Number is too Large");
            } else {
                System.out.println("Your Number is too Small");
            }

            int remainingAttempts = maxAttempts - attempts;
            System.out.println("Attempts left: " + remainingAttempts);
            if (remainingAttempts == 0) {
                System.out.println("Sorry, you've run out of attempts. The correct number was: " + num);
            } else {
                System.out.println("Guess again:");
            }
        }
    }

    private static void displayScore(int attempts) {
        // You can define your scoring system here
        // For example, you can give more points for fewer attempts
        int score = 100 - (attempts * 10);
        System.out.println("Your Score: " + score);
    }
}
