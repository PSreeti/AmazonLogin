package Collection;


import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

       Set s = new HashSet();
       s.add(20);
       s.add(30.9);
       s.add(21);
        s.add(21);
       s.add(null);
       s.add(null);

        //System.out.println(s);

        for(Object Hash: s)
        {
            System.out.println(Hash);
        }
    }
}
