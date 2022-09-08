package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {
    public static void main(String[] args) {
     HashSet hs = new HashSet();
     hs.add(10);
     hs.add(30.8);
     hs.add(30);
        hs.add(30);
      hs.remove(30);

        System.out.println("size is " + hs.size());
//        for ( Object i: hs)
//        {
//            System.out.println(i);
//        }

        Iterator I = hs.iterator();
        while(I.hasNext())
        {
            System.out.println(I.next());
        }


    }
}
