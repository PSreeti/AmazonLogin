package ExceptionHandling;

import java.io.FileInputStream;

public final class Demo1 {

    public static void main(String[] args) {

        try{
            int[] a = {1,2,3,4};
            System.out.println(a[6]);
        }

        catch(Exception e){
            System.out.println(e);

        }
    }
}
