import java.util.* ;
public class ItineraryTickets { 
    public static void main(String[] args) {                        // TC = O(n)
        HashMap<String,String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru") ;
        tickets.put("Mumbai", "Delhi") ;
        tickets.put("Goa", "Chennai") ;
        tickets.put("Delhi", "Goa") ;

        String start = getStart(tickets) ;
        System.out.print(start);
        for(String key : tickets.keySet()){
            System.out.print(" -> "+tickets.get(start));
            start = tickets.get(start) ;
        }
        System.out.println();
    }

    public static String getStart(HashMap<String,String> tickets){
        HashMap<String, String> revMap = new HashMap<>() ;

        for (String key  : tickets.keySet()) {
            revMap.put(tickets.get(key), key) ;         //Order Reversed
        }

        for (String key  : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key ;                            //Strat Point
            }
        }
        return null ;
    }
}
