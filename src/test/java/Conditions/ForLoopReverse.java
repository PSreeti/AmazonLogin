package Conditions;

public class ForLoopReverse {
    public static void main(String[] args) {

        int num = 123;
        int reverse = 0;

        for (;num != 0;num = num / 10)
        {

            int rem = num % 10;  // 3
            reverse = (reverse* 10) + rem; // 3

        }
        System.out.println("reverse is " + reverse );

    }
}
