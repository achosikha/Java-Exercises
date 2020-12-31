package OOP.Animals2;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate (){}

    public Plate (int food)
    {
        this.food = food;
    }

    public void decreaseFood (int n) { food -= n; }

    public void info() { System.out.println ("The plate has: " + food); }

    public int getFood() { return food; }

    public void getMessage()
    {
        System.out.print ("Some cats are still hungry. Please add food to the plate: ");
    }

    public int addFood()
    {
        Scanner myFood = new Scanner(System.in);

        return myFood.nextInt();
    }

    public int reinitializeFood()
    {
        getMessage();
        return food = (food + addFood());
    }
}
