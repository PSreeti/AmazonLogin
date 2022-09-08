package Conditions;

import java.util.Scanner;

public class PrintfloatNum {

        public static void main(String[] args) {
            Scanner num = new Scanner(System.in);
            System.out.println("Enter the Num");
            float number = num.nextFloat();

            if (number>0)
            {
                if(number<1)
                {
                    System.out.println("small");
                }
                else if (number>100000)
                {
                    System.out.println("large");
                }
                else {
                    System.out.println("positive");
                }
                //else
                {
                    System.out.println("negative");
                }
            }


//            if(number>0)
//
//            {
//                System.out.println("Positive Num");
//            }
//            else if (number<0)
//            {
//                System.out.println("negative");
//            }
//            else {
//                System.out.println("zero");
//            }
// small if < 1
            // large >1000000
        }

    }


