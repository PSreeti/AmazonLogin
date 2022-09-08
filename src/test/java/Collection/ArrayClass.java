package Collection;

import java.util.ArrayList;

public class ArrayClass {
    public static void main(String[] args) {



        ArrayList al = new ArrayList();
        al.add(20);
        al.add(30);
        al.add("preeti");
        al.add(20.9);
        al.add(20.9);
        al.add(null);
        al.add(null);
        al.add('d');
        al.set(1,40);
        al.remove(3);
 
        int maths=70;
        al.add(maths);
    al.set(7,maths-3);

        System.out.println(al);
        System.out.println(al.get(4));
        System.out.println(al.size());

    }
}
