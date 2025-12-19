import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = {60, 100, 120} ;
        int weight[] = {10, 20, 30} ;
        int W = 50 ;
        
        double ratio[][] = new double[val.length][2] ;
        // 0th col = orig idx   1st col = item ratio

        for(int i=0 ; i<val.length ; i++){
            ratio[i][0] = i ;
            ratio[i][1] = (val[i]/(double)weight[i]) ;
        }
        //Ascending Order           But we need ratio in descending order 
        Arrays.sort(ratio , Comparator.comparingDouble(o -> o[1]));

        int capacity = W ;
        int finVal = 0 ;

        for(int i=ratio.length-1 ; i>= 0 ; i--){
            int idx = (int)ratio[i][0] ;
            if(capacity >= weight[idx]){        //include full item 
                finVal += val[idx] ;
                capacity -= weight[idx] ;
            }else{
                finVal += (ratio[i][1]*capacity) ;      //include fractional item 
                capacity = 0 ;
                break ;
            }
        }

        System.out.println("Final Value = "+finVal);
    }
}
