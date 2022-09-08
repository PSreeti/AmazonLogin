package ExceptionHandling;

public class webpage {
    public static void main(String[] args) {
        try
        {
            String a = null;
            System.out.println(a.length());
        }

        catch(Exception g)
        {
            System.out.println(g);
        }

    }
}
