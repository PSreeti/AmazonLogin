package Inheritance;

public class Mango extends Fruits {
    @Override
    public void Healthy()
    {
        System.out.println("Mango is a Healthy Fruit");
    }
    @Override
    public void Colour()
    {
        System.out.println("Mango is Yellow in Colour");
    }

    public void taste()
    {
        System.out.println("Mangoes are sweet in taste");

    }

    @Override
    public void FruitsAvail(int i) {
        System.out.println("Number of Mangoes "+ i);
    }
    public void SeasonalFruit(String str)
    {
        System.out.println("Is this a seasonal fruit "+ str);
    }
}
