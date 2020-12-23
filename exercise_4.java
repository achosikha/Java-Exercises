import java.util.Random;
import java.util.Scanner;

public class exercise_4 {

    private static int [][] myMatrix;
    private static int matrixSize;
    private static int usersX, usersY;
    private static int xAI, yAI;
    private static int turn = 1;
    private static int usersPoints = 0;
    private static int pointsAI = 0;
    private static int loopCounter = 1;
    private static boolean gameOver = false;

    public static void main (String[] args){
        /*
        1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не
        подглядывать в методичку.
        2. Переделать проверку победы, чтобы она не была реализована просто набором условий,
        например, с использованием циклов.
        3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5
        и количества фишек 4. Очень желательно не делать это просто набором условий для каждой
        из возможных ситуаций;
        4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
         */

        // welcoming message
        getInitialMessage();
        matrixSize = matrixSizeCheck(getNumber());

        // set matrix size
        myMatrix = new int[matrixSize][matrixSize];

        // start game
        startGame();
    }

    // Game Starter
    static void startGame()
    {
        initializeArray();
        instructHowToPlay();
        getArray();
        tryAgain();
    }

    static void tryAgain()
    {
        do {
            if (!gameOver)
            {
                System.out.println ();
                System.out.print ("Please enter the x and y coordinates: ");
                usersCoordinatesCheck(getNumber(), getNumber());
                checkCoordinatesValue();
                reInitializeArray();
                System.out.println();
                getArray();
                algorithmResult();
                moveAI();
                loopCounter++;
            }
            else
            {
                System.exit(0);
            }
        } while (loopCounter <= (matrixSize*3));
    }

    // Initial message
    static void getInitialMessage()
    {
        System.out.print ("Let's Play Tic-Tac-Toe.\nPlease enter number of the matrix " +
                            "(3 - 3x3, 4 - 4x4, 4- 5x5): ");
    }

    // matrix size check
    static int matrixSizeCheck(int matrixSize)
    {
        while (matrixSize < 3 || matrixSize > 5) {
            System.out.print("You have entered wrong matrix size value. Please enter proper value: ");
            matrixSize = getNumber();
            }
            return matrixSize;
    }

    // check user's coordinates
    static void usersCoordinatesCheck(int x, int y)
    {
        while (x < 1 || x > matrixSize && y < 1 || y > matrixSize) {
            System.out.println ("\nThe coordinates you have entered are wrong.");
            System.out.println ("X and Y coordinates from 1 to " + matrixSize);
            System.out.print ("Please re-enter x and y coordinates: ");
            x = getNumber();
            y = getNumber();
        }
        usersX = x;
        usersY = y;
    }

    // check whether the [][] is free or not
    static void checkCoordinatesValue()
    {
        while (myMatrix[usersX-1][usersY-1] != 0)
        {
            System.out.println ("\nThe coordinates you have entered are already busy.");
            System.out.print ("Please re-enter x and y coordinates: ");
            usersX = getNumber();
            usersY = getNumber();
        }
    }

    // make first initialization
    static void initializeArray()
    {
        for (int size = 0; size <myMatrix.length; size++)
        {
            for (int size1 = 0; size1 < myMatrix.length; size1++)
            {
                myMatrix[size][size1] = 0;
            }
        }
    }

    // re-initialize array with new data
    static void reInitializeArray ()
    {
        if (turn == 1) {
            myMatrix[usersX-1][usersY-1] = 1;
            turn++;
        }
        else
        {
            myMatrix[xAI][yAI] = 2;
            turn--;
        }
    }

    // instructions how to play
    static void instructHowToPlay()
    {
        System.out.println ("\nYou have chosen " + matrixSize + " matrix size.");
        System.out.println ("X (horizontal) and Y (vertical) coordinates start with 1.");
        System.out.println ("You make the first move. Your number = 1, AI = 2.\n");
    }

    // output main array/matrix
    static void getArray ()
    {
        for (int size = 0; size <myMatrix.length; size++)
        {
            for (int size1 = 0; size1 < myMatrix.length; size1++)
            {
                System.out.print (myMatrix[size][size1] + "  ");
            }
            System.out.println();
        }
    }

    // enter number function
    static int getNumber()
    {
        Scanner myNumber = new Scanner(System.in);

        return myNumber.nextInt();
    }

    static void getAiMessage()
    {
        System.out.print ("\nAI x and y coordinates are: ");
    }

    // get horizontal check
    static void algorithmHorizontals()
    {
        for (int ver = 0; ver < matrixSize; ver++)
        {
            for (int hor = 0; hor < matrixSize; hor++)
            {
                if (myMatrix[ver][hor] == 1) {
                    usersPoints++;
                }
                if (myMatrix[ver][hor] == 2) {
                    pointsAI++;
                }
            }
            algorithmInterference();
        }
    }

    // get vertical check
    static void algorithmVertical()
    {
        for (int ver = 0; ver < matrixSize; ver++)
        {
            for (int hor = 0; hor < matrixSize; hor++)
            {
                if (myMatrix[hor][ver] == 1) {
                    usersPoints++;
                }
                if (myMatrix[hor][ver] == 2) {
                    pointsAI++;
                }
            }
            algorithmInterference();
        }
    }

    // get diagonal left - right
    static void algorithmDiagonalLeft()
    {
        for (int diag = 0, row = 0, column = 0;
             diag < matrixSize; diag++, row++, column++) {
            if (myMatrix[row][column] == 1)
            {
                usersPoints++;
            }
            if (myMatrix[row][column] == 2)
            {
                pointsAI++;
            }
        }
        algorithmInterference();
    }

    // get diagonal right - left
    static void algorithmDiagonalRight()
    {
        for (int diag = 0, row = 0, column = (matrixSize-1);
             diag < matrixSize; diag++, row++, column--)
        {
            if (myMatrix[row][column] == 1)
            {
                usersPoints++;
            }
            if (myMatrix[row][column] == 2)
            {
                pointsAI++;
            }
        }
        algorithmInterference();
    }

    // algorithm
    static void algorithmResult()
    {
        if (loopCounter >= matrixSize) {
            //algorithms checking result
            algorithmHorizontals();
            algorithmVertical();
            algorithmDiagonalLeft();
            algorithmDiagonalRight();
        }
    }

    // algorithm interference
    static void algorithmInterference ()
    {
        getResult();
        usersPoints = 0;
        pointsAI = 0;
    }

    // WIN, LOST or DRAW
    static void getResult ()
    {
            if (usersPoints == matrixSize )
            {
                getFinalMessage("WON");
            }
            if (pointsAI == matrixSize)
            {
                getFinalMessage("LOST");
            }
            if (loopCounter == (matrixSize*3))
            {
                getFinalMessage("NONE");
            }
    }

    // get result message
    static void getFinalMessage(String result)
    {
        switch (result) {
            case "WON": {
                System.out.println("\nCongratulations! You WON! GAME OVER!");
                break;
            }
            case "LOST": {
                System.out.println("\nSorry! You LOST! GAME OVER!");
                break;
            }
            case "NONE": {
                System.out.println("\nDEAD HEAT! GAME OVER!");
                break;
            }
            default: {
                System.out.println("\nYou should never reach this message!");
                break;
            }
        }
        gameOver = true;
        tryAgain();
    }

    static int getRandomNumber ()
    {
        Random myRandom = new Random();

        return myRandom.nextInt(matrixSize);
    }

    // AI move
    static void moveAI() {
        int xAIscreen = 0;
        int yAIscreen = 0;

        if (!gameOver) {
            getAiMessage();

            do {
                xAI = getRandomNumber();
                yAI = getRandomNumber();
            } while (myMatrix[xAI][yAI] != 0);

            xAIscreen = xAI + 1;
            yAIscreen = yAI + 1;

            System.out.println(xAIscreen + "  " + yAIscreen);
            System.out.println();
            reInitializeArray();
            getArray();
            algorithmResult();
            loopCounter++;
        }
    }
}
