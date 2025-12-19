public class SumSubarray {
    
    /*
    public static void MaxSumSubArray(int numbers[]){   // Brute Force       TQ = O(n3)
        int maxsum = Integer.MIN_VALUE ;
        
        for(int i=0; i<numbers.length ; i++){
            for(int j=i; j<numbers.length ; j++){
                int sum = 0 ;
                for(int k=i ; k<=j ; k++){
                    System.out.print(numbers[k]+" ");
                    sum = sum+ numbers[k] ;              // sum += numbers[k]
                }
                if(maxsum < sum){
                    maxsum = sum ;
                }
                System.out.println("          Sum = "+sum);
            }
            System.out.println();
        }
        System.out.println("Maximun sum of subarray is : "+maxsum);
    }
    */

    public static void MaxSumSubArray(int numbers[]) {      // Prefix Sum    TQ = O(n2)
        int maxsum = Integer.MIN_VALUE;
        int Prefix[] = new int[numbers.length] ;
        //calculate prefix 
        Prefix[0]=numbers[0] ;
        for(int i =1 ;i < Prefix.length ; i++){
            Prefix[i] = Prefix[i-1] + numbers[i] ;
        }

        for(int i=0 ; i<numbers.length ; i++){
            for(int j=i ;j<numbers.length ;j++ ){
                                //start      end      end           start-1
                int currentsum = i== 0 ? Prefix[j] : Prefix[j] - Prefix[i-1] ;
            
                if(maxsum < currentsum){
                    maxsum = currentsum ;
                }
            }
        }
        System.out.println("Maximum sum = "+maxsum);
    }

    public static void Kadanes (int numbers[]){
        int ms = Integer.MIN_VALUE ; 
        int cs = 0 ;

        for(int i=0 ; i<numbers.length ; i++){
            cs = cs + numbers[i] ;
            if(cs<0){
                cs = 0;
            }
            ms = Math.max(cs,ms) ;
        }
        System.out.println("Maximum subarray sum is = "+ms);
    }

    public static void main(String args[]){
        int numbers[] = {0,1,2,3,4,5} ;
        //MaxSumSubArray(numbers);
       // MaxSumSubArray(numbers) ;
        Kadanes(numbers);
    }
}
