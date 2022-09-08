package Test3;

public class AAPNAProgram {

    public static void main(String[] args) {
        String name = "I am aapna commando";
        String find= "aapna";
        int i = name.indexOf(find);

        if (i>0)
        {
            System.out.println(name.substring(i,i+find.length()));

        }

    }
}


//Write a program to print "aapna from "I am aapna commando" using string methods?