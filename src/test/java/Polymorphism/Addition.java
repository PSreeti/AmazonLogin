package Polymorphism;

public class Addition
{
    public int sum(int x, int y)
    {
       return (x+y);
    }

public int sum(int x, int y, int z)
{
    return(x+y+z);
}

    public static void main(String[] args) {
        Addition s = new Addition();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(10,20,30));
    }



}