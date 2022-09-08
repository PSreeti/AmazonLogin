package Classes;

public class Tiger extends Animal {

    int price = 30000;

    public void show(int price)
    {
        System.out.println(price);

    }
    public void dangerous()
    {
       super.dangerous();
       System.out.println("Call Murli");
    }

    public static void main(String[] args) {
        Tiger t= new Tiger();
        t.show(10);
    }
}
