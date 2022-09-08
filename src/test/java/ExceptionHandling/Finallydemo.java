package ExceptionHandling;

public class Finallydemo {
    public static void main(String[] args) {

        try
        {
        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }
        catch(Exception e){
            System.out.println(e);
        }


        finally {
            System.out.println("Will always run");

        }
}}
