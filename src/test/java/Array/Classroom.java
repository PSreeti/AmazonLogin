package Array;

public class Classroom {
public static void main (String[] args)
{
    /*int[] marks = new int[20];
    marks[0]= 90;
    marks[1]= 70;
    marks[2]= 60;
    marks[2]= 80;

    System.out.println(marks [2]);

     */

    int[] marks = {60,70,80,90};
    int sum=0;

    for(int i=0; i<marks.length;i++)
    {
        sum+= marks[i];

    }
    System.out.println(sum);
}


    }

