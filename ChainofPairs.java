import java.util.*;

public class ChainofPairs {
    public static void main(String[] args) {                // O(n log n)
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90},} ;
        
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])) ;
        
        int chainlen = 1 ;
        int pairEnd = pairs[0][1] ;     //Last selected pair

        for(int i= 1 ; i<pairs.length ; i++){ 
            if(pairs[i][0] >= pairEnd){
                chainlen++ ;
                pairEnd = pairs[i][1] ;
            } 
        }
        System.out.println("No of max pairs in Chain = "+chainlen);
    }
}
