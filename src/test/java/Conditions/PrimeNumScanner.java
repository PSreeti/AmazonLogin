package Conditions;

import java.util.Scanner;

public class PrimeNumScanner {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Give the number "  );
         num = input.nextInt();



        int temp = 0;

        for (int i = 2; i<num;i++)
        {
            if (num % i == 0)
            {
                temp = temp +1;
            }

        }

        if( temp>0)
        {
            System.out.println("Not Prime");
        }
        else {
            System.out.println("prime");
        }
    }
}
