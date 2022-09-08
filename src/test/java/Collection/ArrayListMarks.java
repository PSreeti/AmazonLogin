package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListMarks {
    public static void main(String[] args) {

        ArrayList marks = new ArrayList();
        marks.add(50);
        marks.add(60);
        marks.add(40);
        marks.add(40.9);
        marks.add(null);
        marks.add(null);
        marks.remove(2);
        marks.set(1, 80);
        marks.add(1, 90);


//        //System.out.println(marks.get(2));
//        System.out.println(marks);
//        System.out.println(marks.size());
//
//       for(Object i : marks)
//       {
//           System.out.println(i);
//       }

        Iterator I = marks.iterator();
        //hashnext() , next()

       while(I.hasNext())
       {
           System.out.println(I.next());
        }

        System.out.println("Using ListIterator");
        ListIterator LI = marks.listIterator();
        while(LI.hasNext()){
            System.out.println(LI.next());
        }
    }}