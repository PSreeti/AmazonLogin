package Array;


import java.util.Arrays;

public class JoinArray {

    public static void main(String[] args) {

        String[] name1 = {"Preeti","Joshi"};
        String[] name2= {"Sandhya"};

        int l1= name1.length;
        int l2= name2.length;
        String [] joinArray = new String[l1+l2];

        System.arraycopy(name1,0,joinArray,0,l1);
        System.arraycopy(name2,0,joinArray,2,l2);
        System.out.println(Arrays.toString(joinArray));
    }
}


