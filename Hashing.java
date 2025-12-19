import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        /* 1st 
        //Create HashMap
        HashMap<String,Integer> hm = new HashMap<>() ;

        //Insert    -   O(1)
        hm.put("India", 100) ;
        hm.put("China", 150) ;
        hm.put("US", 50) ;

        System.out.println(hm);

        //Get   -   O(1) 
        int population = hm.get("India") ;
        System.out.println("Populn of India = "+population);
        System.out.println(hm.get("Indonesia"));        //Wrong Key -> null value

        //containsKey   -   O(1)
        System.out.println(hm.containsKey("US")); //true
        System.out.println(hm.containsKey("Japan")); //false
        
        //Remove    -   O(1)
        System.out.println(hm.remove("China")) ;
        System.out.println(hm);

        //Size  -   O(1)
        System.out.println(hm.size());

        //IsEmpty
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println(hm.isEmpty());            */

        HashMap<String,Integer> hm = new HashMap<>() ;
        hm.put("India", 100) ;
        hm.put("China", 150) ;
        hm.put("US", 50) ;
        hm.put("Indonesia", 6) ;
        hm.put("Nepal", 5) ;

        //Iterate 
        Set<String> keys = hm.keySet() ;
        System.out.println(keys);

        for (String k : keys) {     //k = single key
            System.out.println("Key = "+k+" , Value = "+hm.get(k));
        }

        System.out.println(hm.remove("US"));
    }
}
