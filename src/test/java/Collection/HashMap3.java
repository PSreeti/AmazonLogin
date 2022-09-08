package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap3 {
    public static void main(String[] args) {

        HashMap<Integer,String> hm1=new HashMap();
        hm1.put(21,"Ram");
        hm1.put(22,"Shyam");
        hm1.put(23,"Dheeraj");

        HashMap<Integer,Integer> hm2=new HashMap();
        hm2.put(21,80);
        hm2.put(22,85);
        hm2.put(23,90);

//           Set<Map.Entry<Integer,String>> set=hm1.entrySet();
//        Set<Map.Entry<Integer,Integer>> set1=hm2.entrySet();
//
//           Iterator<Map.Entry<Integer,String>> iterator = set.iterator();
//        Iterator<Map.Entry<Integer,Integer>> iterator1 = set1.iterator();
//
//        while(iterator.hasNext() && iterator1.hasNext())
//        {
//
//            Map.Entry<Integer,String> entry= iterator.next();
//            Map.Entry<Integer,Integer> entry1= iterator1.next();
//
//            System.out.println(entry.getKey()  + "  "+ entry.getValue() );

        System.out.println(hm1 +"   "+ hm2);


        }

    }

