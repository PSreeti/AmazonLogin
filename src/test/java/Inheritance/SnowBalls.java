package Inheritance;

public class SnowBalls extends VideoGames {

    private double moneyEarned;
    String name = "Shyam";

    public void ageGroup()
    {
        System.out.println("Preferred by young age group ");

    }
    public void price()
    {
        System.out.println("Average Price");
    }
    public void availability()
    {
        System.out.println("Snow Balls games are easily avail");
    }

    public void setMoneyEarned(double moneyValue)            //setter
    {
        moneyEarned=moneyValue;
    }
    public double getMoneyEarned ()                    //getter
    {
        return moneyEarned;

    }
    public void show(String name)
    {
        System.out.println(this.name);
    }




}
