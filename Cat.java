package OOP.Animals2;

public class Cat{
    private String name;
    private int appetite;
    private boolean ifFullness;

    public Cat () {};

    public Cat (String name, int appetite, boolean ifFullness)
    {
        this.name = name;
        this.appetite = appetite;
        this.ifFullness = ifFullness;
    }

    public void eat (Plate p)
    {
        if (enoughFood(p.getFood())) {
            p.decreaseFood(appetite);
        }
        getInfo();
    }

    public boolean enoughFood (int food)
    {
        ifFullness = appetite < food;

        return ifFullness;
    }

    public void getMessage (boolean ifFullness)
    {
        if (ifFullness)
        {
            System.out.printf ("Cat %s is full\n", name);
        }
        else
        {
            System.out.printf("Cat %s is hungry. There is not enough food on the plate.\n", name);
        }
    }

    public void getInfo()
    {
        System.out.printf ("Cat %s has %s appetite\n", name, appetite);
        getMessage(ifFullness);
    }

    public void setIfFullness(boolean ifFullness) { this.ifFullness = ifFullness; }

    public boolean getIfFullness () { return ifFullness; }

    public String getName() { return name; }

    public int getAppetite() { return appetite; }
}
