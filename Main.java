package OOP.Animals;

public class Main {
    public static void main (String args[])
    {
        //1. Создать классы Собака и Кот с наследованием от класса Животное.
        //2. Все животные могут бежать и плыть. В качестве параметра каждому
        // методу передается длина препятствия. Результатом выполнения действия
        // будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик
        // пробежал 150 м.');
        //3. У каждого животного есть ограничения на действия (бег: кот 200 м.,
        // собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        //4. * Добавить подсчет созданных котов, собак и животных.

        Dogs bullDog = new Dogs("Bulldog",500, 250,
                                10, "N/A");
        Cats persianCat = new Cats("Persian Cat",200,150,
                                0, "Doesn't swim");

        System.out.println (bullDog.getName() + ":\n\n" +
                            "maxRun - " + bullDog.getMaxRun() + "\n" +
                            "runDistance - " + bullDog.getRunDistance() + "\n" +
                            "swimDistance - " + bullDog.getSwumDistance() + "\n" +
                            "restrictions - " + bullDog.getRestrictions());

        System.out.println();

        System.out.println (persianCat.getName() + ":\n\n" +
                "maxRun - " + persianCat.getMaxRun() + "\n" +
                "runDistance - " + persianCat.getRunDistance() + "\n" +
                "swimDistance - " + persianCat.getSwumDistance() + "\n" +
                "restrictions - " + persianCat.getRestrictions());

        System.out.println();

        System.out.println ("Created Dogs number is: " + Dogs.getDogsNumber());
        System.out.println ("Created Cats number is: " + Cats.getCatsNumber());
        System.out.println ("Created Animals number is: " + Animals.getAnimalsNumber());
    }
}
