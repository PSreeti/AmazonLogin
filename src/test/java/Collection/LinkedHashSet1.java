package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
    public static void main(String[] args) {
        LinkedHashSet Lh = new LinkedHashSet();
        Lh.add(20);
        Lh.add(30);

        for ( Object i:Lh)
        {
            System.out.println(i);
        }
    }
}
