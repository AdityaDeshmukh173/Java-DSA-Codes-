import java.util.*;

public class LargSubArr0Sum {
    public static void main(String[] args) {            //TC = O(n)
        int arr[] = {15,-2,2,-8,1,7,10,23} ;

        HashMap<Integer,Integer> map = new HashMap<>() ;
        //sum , index 

        int sum = 0 ;
        int len = 0 ;

        for(int j=0; j<arr.length ; j++){
            sum += arr[j] ;
            if (map.containsKey(sum)) {
                len = Math.max(len, j-map.get(sum)) ;
            }else{
                map.put(sum, j) ;
            }
        }

        System.out.println("The longest subarray with sum 0 is : "+len);


        // Subarray Sum Equal to k                          // TC = O(n)
        int array[] = {10,2,-2,-20,10} ;
        int k = -10 ;

        HashMap<Integer,Integer> map2 = new HashMap<>() ;
        //sum , count
        map2.put(0, 1) ;
        
        int summ = 0 ;
        int ans = 0 ;

        for(int j=0 ; j<array.length ; j++){
            summ += array[j] ;  //sum(j)
            if (map2.containsKey(summ-k )) {
                ans += map2.get(summ-k) ;
            }
            map2.put(summ, map2.getOrDefault(summ, 0) + 1) ;
        }

        System.out.println(ans);
    }
}
