package OOP.Animals;

public class Dogs extends Animals {
    private static int dogsNumber = 0;

    public Dogs(String name, int maxRun, int runDistance, int swumDistance, String restrictions){
        super(name, maxRun, runDistance, swumDistance, restrictions);
        dogsNumber++;
    }

    public static int getDogsNumber() {
        return dogsNumber;
    }
}
