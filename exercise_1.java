// Archil Sikharulidze, Java - level 1 - exercise 1, deadline 10.12.2020

public class exercise_1 {
    // Task 1: Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main (String args []){

        // Task 2: Создать переменные всех пройденных типов данных и инициализировать
        // их значения.
        getDataTypes();

        // Task 3: Написать метод, вычисляющий выражение a * (b + (c / d)) и
        // возвращающий результат, где a, b, c, d – аргументы этого метода,
        // имеющие тип float.
        System.out.println ("\nTask 3: " + floatResult(4,5,6,7));

        // Task 4: Написать метод, принимающий на вход два целых числа и
        // проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
        // если да – вернуть true, в противном случае – false.
        System.out.println ("\nTask 4: " + getBoolean(10,10));

        // Task 5: Написать метод, которому в качестве параметра передается целое
        // число, метод должен напечатать в консоль, положительное ли число передали
        // или отрицательное. Замечание: ноль считаем положительным числом.
        getNum(-1);

        // Task 6: Написать метод, которому в качестве параметра передается целое
        // число. Метод должен вернуть true, если число отрицательное, и вернуть
        // false если положительное.
        System.out.println (getTrue(-127));

        // Task 7: Написать метод, которому в качестве параметра передается строка,
        // обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
        System.out.println ("Привет, " + (getName("Арчил Сихарулидзе")) + "!");

        // Task 8: Написать метод, который определяет, является ли год високосным, и выводит
        // сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при
        // этом каждый 400-й – високосный.
        getYear(1992); // В интернете ничего не смотрел, только проверил насколько правильно работает
                        // и кажется, что правильно. Даже удивился.
    }

    // Task 2: Get Data Types
    static void getDataTypes ()
    {
        // Integer types

        byte smallest = 125;
        short short_integer = 14569;
        int integer = 109009;
        long long_integer = 145698093;

        // Floating point integers

        float floating = 1.222F;
        double double_float = 2223.222222D;

        // Logical type
        boolean ifTrue = false;

        // Letter type
        char just_letter = 'A';

        // Long text type
        String long_text = "This is long text - type String";

        System.out.println ("We have learned the following data types: \n");

        System.out.println ("Integer types: byte - short - int - long");
        System.out.println ("Byte: byte _name = _value: " + smallest);
        System.out.println ("Short: short _name = _value: " + short_integer);
        System.out.println ("Int: int _name = _value: " + integer);
        System.out.println ("Long: long _name = _value: " + long_integer);

        System.out.println ();

        System.out.println ("Floating point integers: float & double");
        System.out.println ("Float: float _name = _valueF: " + floating);
        System.out.println ("Double: double _name = _valueD: " + double_float);

        System.out.println ();

        System.out.println ("Logical type: boolean");
        System.out.println ("Boolean: boolean _name = true or false: " + ifTrue);

        System.out.println ();

        System.out.println ("Letter type: char");
        System.out.println ("Char: char _name = '_letter or number': " + just_letter);

        System.out.println ();

        System.out.println ("Long text type: String");
        System.out.println ("String: String _name = \"_text\": " + long_text);
    }

    // Task 3: method returning float of a * (b + (c / d))
    static float floatResult (float a, float b, float c, float d)
    {
        return a * (b + (c / d));
    }

    // Task 4: compare numbers and get boolean result - true or false
    static boolean getBoolean (int num, int num2)
    {
        return ((num + num2) >= 10 && (num + num2) <= 20);
    }

    // Task 5: positive or negative number
    static void getNum (int number)
    {
        System.out.println ("\nTask 5: ");
        if (number >= 0)
        {
            System.out.println ("The number you have transferred is POSITIVE: " + number);
        }
        else {
            System.out.println("The number you have transferred is NEGATIVE: " + number);
        }
    }

    // Task 6: getTrue if number >= 0
    static boolean getTrue (int number1)
    {
        System.out.println ("\nTask 6: you have transferred: " + number1);
        System.out.print ("If POSITIVE = true, else = false: ");

        return (number1 >= 0);
    }

    // Task 7: getName String
    static String getName (String name)
    {
        System.out.print ("\nTask 7: ");
        return name;
    }

    // Task 8: a lear year or not
    static void getYear (int year)
    {
        System.out.println ("\nTask 8: The year you have transferred is : " + year);

        if (year % 4 == 0)
        {
            if (year % 100 != 0)
            {
                if (year % 400 != 0)
                {
                    System.out.println ("Year " + year + " is a leap year.");
                }
            }
        }
        else
        {
            System.out.println ("Year " + year + " is a non leap year.");
        }
    }
}
