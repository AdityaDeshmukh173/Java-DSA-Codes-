import java.util.*;
public class HashSetHS {
    public static void main(String[] args) {
        /*HashSet<Integer> set = new HashSet<>() ;
        set.add(2) ;
        set.add(1) ;
        set.add(4) ;
        set.add(2) ;
        set.add(1) ;
        System.out.println(set); 

        System.out.println(set.size());
        set.remove(2) ;
        if(set.contains(2)){
            System.out.println("Set Contains 2");
        }
        set.clear();
        System.out.println(set.size());
    */
        HashSet<String> cities = new HashSet<>() ;
        cities.add("Delhi") ;
        cities.add("Mumbai") ;
        cities.add("Noida") ;
        cities.add("Bangluru") ;

        // Iterator it = cities.iterator() ;
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // for (String  city : cities) {
        //     System.out.println(city);
        // }

        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>() ;
        lhs.add("Delhi") ;
        lhs.add("Mumbai") ;
        lhs.add("Noida") ;
        lhs.add("Bangluru") ;
        
        System.out.println(lhs);

        TreeSet<String> ts = new TreeSet<>() ;
        ts.add("Delhi") ;
        ts.add("Mumbai") ;
        ts.add("Noida") ;
        ts.add("Bangluru") ;
        System.out.println(ts);

    }
}
