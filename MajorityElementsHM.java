import java.util.* ;
public class MajorityElementsHM {
    public static void main(String[] args) {            // TC = O(n)
        
        int arr[] = {1,3,2,5,1,3,1,5,1} ;
        HashMap<Integer,Integer> map = new HashMap<>() ;

        for(int i=0 ; i<arr.length ; i++){
            // if (map.containsKey(arr[i])) {
            //     map.put(arr[i] , map.get(arr[i]) + 1) ;
            // }else{
            //     map.put(arr[i], 1) ;                     //Short Cut 
            // }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1) ;          // If key exists then returns its value else returns the default which we have set
        }

        // Set<Integer> keySet = map.keySet() ;
        // for(Integer key : keySet){
        for(Integer key : map.keySet()){
            if (map.get(key) > arr.length/3 ) {
                System.out.println(key);
            }
        }
    }
}
