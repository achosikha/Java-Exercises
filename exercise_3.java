import java.util.Random;
import java.util.Scanner;

public class exercise_3 {

    private static int attempts; // знаю, что такие переменные плохая практика, но
                                // исходя из логики моей программы я не знал, как
                                // по другому решить этот вопрос. Что посоветуете?!

    public static void main(String[] args) {

        // Task 1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3
        // попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли указанное
        // пользователем число, чем загаданное, или меньше. После победы или проигрыша выводится запрос –
        // «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        gameStarter(); // game initializer
    }

    // Method initializing the game
    static void gameStarter() {
        attempts = 1;
        getInitialMessage();
        conditionChecks(randomNumber(), getNumber());
    }

    // get the number from the user SCANNER
    static int getNumber() {
        Scanner getNumber = new Scanner(System.in);

        return getNumber.nextInt();
    }

    // get random number from RANDOM
    static int randomNumber() {
        Random random = new Random();

        int myRandomNumber = random.nextInt(10);

        return myRandomNumber;
    }

    // keepRandomNumber if trying
    static int keepRandomNumber() {
        int keepRanNumber = randomNumber();

        return keepRanNumber;
    }

    // get initial message about the game
    static void getInitialMessage() {
        System.out.println("The computer generated random number from 0 to 9.");
        System.out.println("Try to guess it. You have three attempts.");
        System.out.print("Please enter your number: ");
    }

    // get message: try again
    static void getSecondaryMessage() {
        System.out.print("Try again: ");
    }

    static void tryAgain() {
        conditionChecks(keepRandomNumber(), getNumber());
    }

    // get message to end or continue the game
    static void getFinalMessage() {
        System.out.print("\nWould you like to repeat the game?! Y = 1, N = 0: ");
        getFinalAnswer();
    }

    // Check the final answer
    static int getFinalAnswer() {
        if (getNumber() == 1) {
            gameStarter();
        } else {
            System.out.println("Game OVER!");
        }
        return 0;
    }

    // check conditions
    static void conditionChecks(int randomNumber, int myNumber) {
        System.out.print("\nThe number you have entered " + myNumber);


        if (attempts < 3)
        {
            if (randomNumber > myNumber)
            {
                System.out.print(" is < randomNumber.\n\n");
                attempts++;
                getSecondaryMessage();
                tryAgain();
            }
            else if (randomNumber < myNumber)
            {
                System.out.print(" is > randomNumber.\n\n");
                attempts++;
                getSecondaryMessage();
                tryAgain();
            }
            else if (randomNumber == myNumber)
            {
                gameResult(1);
            }
        } else
        {
            gameResult(0);
        }
    }

    // check whether user WON or LOST
    static void gameResult(int result) {
        switch (result) {
            case 0: {
                System.out.println("\n\nYou LOST!");
                break;
            }
            case 1: {
                System.out.println("\n\nYou WON!");
                break;
            }
            default: {
                System.out.println("\n\nYou should never get here!");
                break;
            }
        }
        getFinalMessage();
    }
}