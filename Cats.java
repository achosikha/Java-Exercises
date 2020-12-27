package OOP.Animals;

public class Cats extends Animals {
    private static int catsNumber = 0;

    public Cats(String name, int maxRun, int runDistance, int swumDistance, String restrictions){
        super(name, maxRun, runDistance, swumDistance, restrictions); // super access to the primary class
        catsNumber++;
    }

    public static int getCatsNumber() {
        return catsNumber;
    }
}
