package StringManipulation;

public class Student {
    public static void main(String[] args) {

        String name = "Preeti";
        String name1 = "PreetiJoshi" ;
        int l = name.length();
        System.out.println("length is " +l);


        char c = name.charAt(0);
        System.out.println("Character is  "+ c);

        int index = name.indexOf('P');
        System.out.println("Index is "+ index);  /// if char dont exist then -1

        int index1=name1.indexOf('i',10); // if we want to search for second occurance
        System.out.println("Index of i "+ index1);

        //or
        int index2 =name1.lastIndexOf('e'); // method lastindexof
        System.out.println("Last Index of e "+ index2);

        String st = "This is Preeti here";
         String subst= st.substring(5,st.length())  ;
        System.out.println(subst);          // if extract part of string use substring


        if (st.contains("here"))            //to check if contain
        {
            System.out.println(st);

        }

        String Upper = name.toUpperCase() ;
        System.out.println(Upper);

        String lower = name.toLowerCase() ;
        System.out.println(lower);

        String st1 = "   this is Preeeti  ";        // only remove space before & after the string
        String trim = st1.trim();
        System.out.println(trim);

        //String equal = name.equals("Preeti");
        


    }
}
