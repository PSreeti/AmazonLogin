package Inheritance;

public class Animal {
    int i = 100;

    private double cost;

    public Animal(String name,int price)
    {
        System.out.println("name is "+ name + " price is "+ price);
    }

    public void animals()
    {
        System.out.println("Pet/Wild animals");
    }

    public void food()
    {
        System.out.println("Pet-variety avail in market / Wild - Forest");
    }
    private void dangerous()
    {
        System.out.println("Pet-Not really / Wild-yes");
    }

    public void dangerousAnimals()
    {
        dangerous();
    }

    public void setCost(double price)
    {
        cost = price;
    }
    public double getCost()
    {
        return cost;
    }

}


