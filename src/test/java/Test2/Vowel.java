package Test2;

public class Vowel {
    public static void main(String[] args) {


        String name = "Murali Krishna";
        int count=0;

        for ( int i=0;i<name.length();i++)
        {
            char ch =name.charAt(i);
           if(ch=='a'||ch =='e'||ch=='i'||ch=='o'||ch=='u')
           {
              count++;
           }
        }
        System.out.println(count);
    }
}






 //1. vowels count in a string EX: "Murali Krishna"
//        Ans : 5