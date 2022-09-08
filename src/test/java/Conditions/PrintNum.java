package Conditions;

import java.util.Scanner;

public class PrintNum {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the Num");
        int number = num.nextInt();

        if(number>0)

        {
            System.out.println("Positive Num");
        }
        else if (number<0)
        {
            System.out.println("negative");
        }
        else {
            System.out.println("zero");
        }
    }
}
