package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatch {
    public static void main(String[] args) throws FileNotFoundException {

      try{
          int[] a = {1,2,3,4};
          System.out.println(a[6]);
      }

      catch(Exception e){
          System.out.println(e);

        }
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }
        catch(Exception g)
        {
            System.out.println(g);
        }
//        finally {
//            System.out.println("error");
//        }

       try
       {
           String a = null;
           System.out.println(a.length());
       }

       catch(Exception g)
        {
            System.out.println(g);
        }

try{
            FileInputStream abc= new FileInputStream("test.text");
        }
catch(Exception e)
{
    System.out.println(e);
}





    }
}
