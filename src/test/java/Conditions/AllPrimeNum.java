package Conditions;

import org.testng.annotations.Test;

public class AllPrimeNum {

   @Test
    public void prime() {

        int i,j;
        int temp= 0;
       for(i=1;i<=100;i++)
       {
           for (j=2;j<=i-1 ;j++)
           {
               if(i%j==0)
               {
                   temp=temp+1;
               }
           }
           if(temp==0)
           {
               System.out.println(i);
           }
           else{
               temp=0;
           }

       }
    }
}