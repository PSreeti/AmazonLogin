package Test2;

import java.util.ArrayList;
import java.util.Iterator;

public class ListAddition {
    public static void main(String[] args) {
       // int sum=0;
        ArrayList<Integer> even = new ArrayList<Integer>();
        for (int i = 1; i<=100; i++) {
            if(i%2==0) {
                even.add(i);
            }
        }

        Iterator itr = even.iterator();
        while (itr.hasNext()) {
            int num = (int) itr.next();
            {
                System.out.println(num);
            }
        }

    }}





//2. Add even numbers between 1 to 100 in  list and print using iterator