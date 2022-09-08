package Collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTable1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht    =new Hashtable<>();
        ht.put(1,"Shyam");
        ht.put(2, "Ram");
        ht.put(3,"Vinod");
        ht.put(3,"Vishal");
        ht.put(1,"null");
        ht.put(4,"null");

            Set<Map.Entry<Integer,String>> set = ht.entrySet();
            Iterator<Map.Entry<Integer,String>>  iterator   =set.iterator();

            while(iterator.hasNext())
            {
                Map.Entry<Integer,String>  entry = iterator.next();
                System.out.println(entry.getKey() +"  "+entry.getValue());
            }

//            for (Map.Entry<Integer,String>  e: ht.entrySet())
//            {
//                System.out.println(e.getKey() + "   "+e.getValue());
//            }
        //System.out.println(ht.entrySet());
}}