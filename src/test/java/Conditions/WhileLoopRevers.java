package Conditions;

public class WhileLoopRevers {
    public static void main(String[] args)
    {
       int num = 987;
       int reminder = 0;
       int reverse = 0;

       while(num != 0)

        {
            reminder = num % 10;
            reverse = reverse * 10 + reminder;
            num = num/10;

        }
        System.out.println("reverse of num is  " + reverse);
    }
}
