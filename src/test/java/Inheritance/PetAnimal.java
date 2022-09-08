package Inheritance;

public class PetAnimal extends Animal {
    int i = 20;

    public PetAnimal(String name, int price) {
        super(name, price);
    }


    public void animals()
    {
        System.out.println("Pet animals");
    }

    public void food()
    {
        System.out.println("variety avail in market");
    }

    public static void medicalServices()
    {
        System.out.println("Vet avail");
    }
    public void show(int i)
    {
        System.out.println(super.i);
    }


}
