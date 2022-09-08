package Collection;

import org.bouncycastle.asn1.cms.CMSAlgorithmProtection;

import javax.annotation.MatchesPattern;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

    public static void main(String[] args) {
       Map<Integer,String> M= new HashMap<>();         //Generic - Specific Key VALUE
        M.put(12,"Preeti");                                  //Non-Generic - COMBINATION
        M.put(13,"Joshi");
        M.put(13,"Pree");
        M.put(14,"Ram");
        M.remove(12);


     Set<Map.Entry<Integer,String>> set =M.entrySet();
     Iterator< Map.Entry<Integer,String>> iterator =set.iterator();
     while(iterator.hasNext())
     {
         Map.Entry<Integer,String> entry =iterator.next();
         System.out.println(entry.getKey()  + "" + entry.getValue());
     }
       // System.out.println(M);
//      Set<Map.Entry<Integer,String>> set= M.entrySet();   // entry is an interface inside map
//       Iterator<Map.Entry<Integer,String>> Iterator = set.iterator();
//       while(Iterator.hasNext())
//       {
//           Map.Entry<Integer,String> entry=Iterator.next();
//           System.out.println(entry.getKey() + "  "+ entry.getValue());
//       }
//                    Set<Map.Entry<Integer,String>> set =M.entrySet();
//                  Iterator<Map.Entry<Integer,String>> iterator=set.iterator();
//                  while(iterator.hasNext())
//                  {
//                      System.out.println(iterator.next());
//                  }




    }
}
