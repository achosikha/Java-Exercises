// Archil Sikharulidze, Java - level 1 - exercise 2, deadline 15.12.2020

public class exercise_2 {
    public static void main (String [] args){

      // Task 1
      getMassive1();

      // Task 2
      getMassive2();

      // Task 3
      getmassive3();

      // Task 4
      getMassive4();

      // Task 5
      getMassive5();

      // Task 6
      System.out.println (getMassive6(new int [] {5, 5, 5, 5, 5, 5, 30, 0}));

        // Task 7.**** Написать метод, которому на вход подается одномерный массив и число n
        // (может быть положительным, или отрицательным), при этом метод должен сместить все
        // элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи
        // нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1
        // (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
        // При каком n в какую сторону сдвиг можете выбирать сами.

        // Не знаю, как сделать это задание не посмотрев в онлайне; перебрал много вариантов,
        // но не получается; обратился к наставнику, но уже не осталось времени додумать.
        // Буду рад, если вы доподскажете и тогда безусловно сделаю, ради принципа.
    }

    // Task 1. Задать целочисленный массив, состоящий из элементов
    // 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью
    // цикла и условия заменить 0 на 1, 1 на 0;
    static void getMassive1 ()
    {
        int array_elementary [] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int loop = 1; loop <= 2; loop++) {
            if (loop == 1) {
                System.out.println ("Task 1");
                System.out.print("Initial array elements are: ");

                for (int size = 0; size < array_elementary.length; size++) {
                    System.out.print(array_elementary[size] + " ");
                }
            } else {
                System.out.print("\nAfter replacement are: ");

                for (int size = 0; size < array_elementary.length; size++) {
                    if (array_elementary[size] == 0)
                    {
                        array_elementary[size] = 1;
                    }
                    else
                    {
                        array_elementary[size] = 0;
                    }
                    System.out.print (array_elementary[size] + " ");
                }
                System.out.println();
            }
        }
    }

    // Task 2. Задать пустой целочисленный массив размером 8.
    // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    static void getMassive2 ()
    {
        int array_elementary [] = new int [8]; // professionally done initialization

        System.out.println ("\nTask 2");
        System.out.print ("Elements of array: ");

        for (int size = 0; size < array_elementary.length; size++)
        {
            if (size == 0)
            {
                array_elementary[size] = 0;
            }
            else
            {
                array_elementary[size] = size * 3;
            }
            System.out.print (array_elementary[size] + " ");
        }
    }

    // Task 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;
    static void getmassive3 ()
    {
        int array_elements [] = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };

        System.out.println ("\n\nTask 3");
        System.out.print ("The initial array was: ");

        for (int size = 0; size < array_elements.length; size++)
        {
            System.out.print (array_elements[size] + " ");
        }

        System.out.print ("\nReshuffled with number < 6 * 2: ");

        for (int size = 0; size < array_elements.length; size++)
        {
            if (array_elements[size] < 6)
            {
                array_elements[size] *= 2;
            }
            System.out.print (array_elements[size] + " ");
        }
    }

    // Task 4. Создать квадратный двумерный целочисленный массив (количество строк
    // и столбцов одинаковое) и с помощью цикла(-ов) заполнить его диагональные
    // элементы единицами;
    static void getMassive4 ()
    {
        int double_array [][] = new int [5][5];


        // Initial double array
        System.out.println ("\n\nTask 4");
        System.out.println ("The initial square array was: ");

        for (int row = 0; row < double_array.length; row++)
        {
            for (int column = 0; column < double_array.length; column++)
            {
                System.out.print ((double_array[row][column] = 0) + "  ");
            }
            System.out.println();
        }

        // Reshuffled with 1s in diagonal
        System.out.println ("\nReshuffled double array with 1s diagonal elements: ");

        for (int loop = 1; loop <= 2; loop++)
            if (loop == 1) {
                for (int loop2 = 0, row = loop2, column = loop2;
                     loop2 < double_array.length; loop2++) {
                    double_array[row++][column++] = 1;
                }
            }
        else
            {
                for (int loop2 = 0, row = loop2, column = double_array.length - 1;
                     loop2 < double_array.length; loop2++) {
                    double_array[row++][column--] = 1;
                }
            }

        for (int row = 0; row < double_array.length; row++)
        {
            for (int column = 0; column < double_array.length; column++)
            {
                System.out.print (double_array[row][column] + "  ");
            }
            System.out.println();
        }
    }

    // Task 5.**Задать одномерный массив и найти в нем минимальный и максимальный элементы
    static void getMassive5 ()
    {
        int array [] = {4, 9, 22, 56, 100, 93, 45, 3, -1, -125, 101};

        int lowest = array[0];
        int highest = array [0];

        System.out.println ("\nTask 5");
        System.out.print ("Initial array was: ");

        for (int row = 0; row < array.length; row++)
        {
            System.out.print (array[row] + "  ");
        }

        for (int row = 0; row < array.length; row++)
        {
            if (lowest > array [row])
            {
                lowest = row;
            }
            else if (highest < array[row])
            {
                highest = row;
            }
        }

        System.out.println ("\nThe lowest element is: ");
        System.out.println ("array [" + lowest + "]: " + array[lowest]);
        System.out.println ("array [" + highest + "]: " + array[highest]);
    }

    // Task 6.**Написать метод, в который передается не пустой одномерный целочисленный
    // массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой
    // и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив
    // не входят.
    static boolean getMassive6 (int array [])
    {
        int right = 0;
        int left = 0;

        System.out.println ("\nTask 6");
        System.out.print ("Massive is: ");

        for (int row = 0; row < array.length; row ++)
        {
            if (row < (array.length - 2))
            {
                left += array[row];
            }
            else
            {
                right += array[row];
            }
            System.out.print (array[row] + "  ");
        }

        System.out.println ("\nMassive left side: " + left);
        System.out.println ("Massive right side: " + right);

        return left == right;
    }
}
