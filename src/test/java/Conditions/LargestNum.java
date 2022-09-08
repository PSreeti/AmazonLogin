package Conditions;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter the Num1");
        int number1 = num.nextInt();
        System.out.println("Enter the Num2");
        int number2 = num.nextInt();
        System.out.println("Enter the Num3");
        int number3 = num.nextInt();

        if(number1>number2)
        if(number1>number3)
        {
            System.out.println(number1);
        }

        if (number2>number1)
            if(number2>number3)
            {
                System.out.println(number2);
            }
        if (number3>number1)
            if(number3>number2)
            {
                System.out.println(number3);
            }


    }
}
