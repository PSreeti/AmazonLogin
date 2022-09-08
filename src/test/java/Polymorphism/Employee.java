package Polymorphism;

public class Employee {

    public void name(String s)
            {
                System.out.println("His name is " + s);
            }
            public void age(int i)
            {
                System.out.println("His age is " + i);
            }
    public void name(int p)
    {
        System.out.println("this is invalid");
    }

    public static void main(String[] args) {

        Employee e = new Employee();
        e.age(26);
        e.name("Ram");
        e.name(6);
    }
}
