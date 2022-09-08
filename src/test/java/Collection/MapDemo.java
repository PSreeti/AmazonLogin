package Collection;

import dev.failsafe.internal.util.Maths;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap();
        hm.put("Maths",70);
        hm.put("English", 80);
        hm.put("Hindi", 88);
        hm.put("Science",90);


              Set<Map.Entry<String,Integer>> set =hm.entrySet();
              Iterator<Map.Entry<String,Integer>> iterator =set.iterator();

              while(iterator.hasNext())

              {
                  Map.Entry<String,Integer> entry =  iterator.next();
                  System.out.println(entry.getKey() +"  "+ entry.getValue());
              }

    }

}
