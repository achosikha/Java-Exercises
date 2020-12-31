package OOP.Animals2;

public class MyCats {
    Plate plate = new Plate(100);
    Cat general = new Cat ();

    public static Cat[] myCats = new Cat[12];

    public void getMyCats() {
        myCats[0] = new Cat("Alex", 5, false);
        myCats[1] = new Cat("Barsik", 9, false);
        myCats[2] = new Cat("Chloy", 3, false);
        myCats[3] = new Cat("Denny", 25, false);
        myCats[4] = new Cat("Elena", 15, false);
        myCats[5] = new Cat("Frank", 20, false);
        myCats[6] = new Cat("Plumpy", 43, false);
        myCats[7] = new Cat("Thin", 4, false);
        myCats[8] = new Cat("Fatty", 45, false);
        myCats[9] = new Cat("Slim", 9, false);
        myCats[10] = new Cat("Slimmer", 3, false);
        myCats[11] = new Cat("Regular", 11, false);

        for (int element = 0; element < myCats.length; element++) {
            plate.info();
            myCats[element].eat(plate);
            if (general.getIfFullness()) { myCats[element].setIfFullness(true); };
            System.out.println();
        }

        checkHungryCats();
    }

    public void checkHungryCats()
    {
        int amountFood = 0;

        for (int element = 0; element < myCats.length; element++)
        {
            if (myCats[element].getIfFullness() == false)
            {
                System.out.println (myCats[element].getName() + " is hungry.");
                amountFood = amountFood + myCats[element].getAppetite();
            }
        }
        System.out.println ("\nThe food on the plate: " + plate.getFood() + ". You need: " + amountFood);
        getMessage();
        System.out.println ("Thank you! Every cat is now FULL!");
    }

    public void getMessage ()
    {
        System.out.println();
        plate.reinitializeFood();
        System.out.println();
        plate.info();
    }
}
