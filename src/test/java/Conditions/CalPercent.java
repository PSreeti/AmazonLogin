package Conditions;

import java.util.Scanner;

public class CalPercent {
    public static void main(String[] args) {

        Scanner marks = new Scanner(System.in);
        double totalMarks = 75;
        System.out.println("Enter marks subject1");

        double number1 = marks.nextDouble();

        System.out.println("Enter marks subject2");

        double number2 = marks.nextDouble();


        double percentage = (number1+number2)/ (totalMarks*3) *100;



        System.out.println(percentage);

    }
}
