package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap2 {
   public static void main(String[] args) {
//lamda
      //thread even & odd numb print
      HashMap<Integer, String> hm = new HashMap<Integer, String>();
      hm.put(1, "Test");
      hm.put(2, "Stage");
      hm.put(null,"UAT" );
      hm.put(null, "perf");

      Set<Map.Entry<Integer, String>> set = hm.entrySet();
      Iterator<Map.Entry<Integer, String>> iterator = set.iterator();

      while (iterator.hasNext()) {
         Map.Entry<Integer, String> entry = iterator.next();
         System.out.println(entry.getKey() + "  " + entry.getValue());
      }

//      hm.remove(4);
//        Set<Map.Entry<Integer, String>> set1=     hm.entrySet();
//      Iterator<Map.Entry<Integer, String>> iterator1 = set1.iterator();
//
//      while (iterator1.hasNext()) {
//         Map.Entry<Integer, String> entry1 = iterator1.next();
//         System.out.println(entry1.getKey() + "   " + entry1.getValue());
//
//
//      }


   }}