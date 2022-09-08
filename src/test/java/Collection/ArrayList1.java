package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

    public static void main(String[] args) {

        List l = new ArrayList();


        l.add(10);
        l.add(10.2);   //index based
        l.add(20);    //allows duplicate value
        l.add(20);
        l.add(null);  // allows multiple null print
        l.add(null);    // follow insertion order

        //l.remove(1);
//        for (int i = 0;i<l.size();i++)
//        {
//            System.out.println(l.get(i));
//        }

       for (Object i : l)
        {
        System.out.println(i);
        }
        //System.out.println(l);


        //System.out.println(l.get(1));
    }
}
