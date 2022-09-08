package StringManipulation;

public class StringFile {
    public static void main(String[] args) {

        String s1= "This is Preeti";
        String  s2= "This is Joshi";

      String s3=  s1 + "   "+ s2;
        System.out.println(s3);
//1. Concat
        String s4 = s1.concat(s2);
        System.out.println(s4);
//2.Length
        int s5= s1.length();
        System.out.println(s5);

//3.Char at
        System.out.println(s1.charAt(3));

//4.Index Of
        System.out.println(s2.indexOf('i'));

        System.out.println(s2.indexOf('i',3));
    }
}
