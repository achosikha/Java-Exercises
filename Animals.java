package OOP.Animals;

public abstract class Animals {
    private int maxRun = 0;
    private int runDistance = 0;
    private int swumDistance = 0;
    private String name = "N/A";
    private String restrictions = "N/A";
    private static int animalsNumber = 0;

    // non-default constructor
    public Animals(String name, int maxRun, int runDistance, int swumDistance, String restrictions)
    {
        this.name = name;
        this.maxRun = maxRun;
        this.runDistance = runDistance;
        this.swumDistance = swumDistance;
        this.restrictions = restrictions;
    }

    public String getName() { return name; }

    public int getMaxRun() {
        return maxRun;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public int getSwumDistance() {
        return swumDistance;
    }

    public String getRestrictions() {
        return restrictions;
    }

    public static int getAnimalsNumber() {
        return Cats.getCatsNumber() + Dogs.getDogsNumber();
    }
}
