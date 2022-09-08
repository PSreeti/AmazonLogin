package ExceptionHandling;

public class NestedTryBlock {
    public static void main(String[] args)
    {

    int[] i= {10,20,30,40};

    try{
        System.out.println(i[2]);

        try{
            System.out.println(i[7]);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    catch(Exception f)
    {
        System.out.println(f);
    }
        System.out.println("terminated");
    }

}