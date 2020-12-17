import java.util.Random;
import java.util.Scanner;

public class exercise_3_1 {

    private
    static String [] myWords = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
            "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
            "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    static int keepRandomNumber;


    public static void main (String args []){
        // 2. * Создать массив из слов
        //String[] words = {"apple", "orange", "lemon", "banana", "apricot",
        // "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
        // "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
        // "pear", "pepper", "pineapple", "pumpkin", "potato"}.
        //При запуске программы компьютер загадывает слово, запрашивает ответ у
        // пользователя, сравнивает его с загаданным словом и сообщает, правильно
        // ли ответил пользователь. Если слово не угадано, компьютер показывает буквы,
        // которые стоят на своих местах.
        //apple – загаданное
        //apricot - ответ игрока
        //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        //Для сравнения двух слов посимвольно можно пользоваться:
        //String str = "apple";
        //char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
        //Играем до тех пор, пока игрок не отгадает слово.
        //Используем только маленькие буквы.

        // method starting the game
        gameStarter();
    }

    // gameStarter method
    static void gameStarter()
    {
        getInitialMessage();
        conditionCheck(enterWord(), setRandomIndex());
    }

    static void tryAgain()
    {
        conditionCheck(enterWord(), keepRandomNumber);
    }

    // get initial message
    static void getInitialMessage()
    {
        System.out.println ("Welcome to the game. The AI picked a random word that you must guess");
        System.out.print ("Please enter the word: ");
    }

    // set random word
    static int setRandomIndex()
    {
        Random random = new Random();

        int randomIndex = random.nextInt(myWords.length - 1);

        keepRandomNumber = randomIndex;

        return randomIndex;
    }

    // get users words
    static String enterWord()
    {
        Scanner enterWord = new Scanner(System.in);

        return enterWord.nextLine();
    }

    // condition check
    static void conditionCheck(String myWord, int randomIndex)
    {
        String randomWord = myWords[randomIndex];
        String usersWord = myWord;

        if (randomWord.equals(usersWord))
        {
            youWon();
        }
        else
        {
            checkLetters(myWord, randomIndex);
            getSecondMessage();
        }
    }

    // letters check
    static void checkLetters(String myWord, int randomIndex)
    {
        String randomWord = myWords[randomIndex];
        String usersWord = myWord;

        char [] theMass = {'#', '#', '#', '#', '#', '#', '#', '#',
                            '#', '#', '#', '#', '#', '#', '#'};

        for (int size = 0; size < randomWord.length(); size++)
        {
            if (randomWord.charAt(size) == usersWord.charAt(size))
            {
                theMass [size] = randomWord.charAt(size);
            }
        }

        for (int size = 0; size < theMass.length; size++)
        {
            System.out.print (theMass[size]);
        }
        System.out.println ("\n");
    }

    // you WON
    static void youWon()
    {
        System.out.println ("You guessed the word! You WON! GAME OVER!");
    }

    // get second message - try again
    static void getSecondMessage()
    {
        System.out.println ("You did not guess the word. Try again: ");
        tryAgain();
    }
}
