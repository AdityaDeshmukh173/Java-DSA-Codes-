public class KnapsackZeroOne {
    
    // Recursion 
    public static int Knapsack(int val[], int wt[], int W, int n){              // TC = O(2^n)
        if (W == 0 || n == 0) {
            return 0 ;
        }
        if (wt[n-1] <= W) {         // Valid
            //Include 
            int ans1 = val[n-1] + Knapsack(val, wt, W-wt[n-1], n-1) ;
            //Exclude
            int ans2 = Knapsack(val, wt, W, n-1 ) ;
            return Math.max(ans1, ans2) ;
        }else{                      // Not Valid
            return Knapsack(val, wt, W, n-1) ;
        }
    }
    
    // Memoization
    public static int KnapsackMemo(int val[], int wt[], int W, int n, int dp[][]){          // TC = O(n*W)
        if (W ==0 || n==0) {
            return 0 ;
        }
        if (dp[n][W] != -1) { 
            return dp[n][W] ;
        }
        if (wt[n-1] <= W) {
            int ans1 = val[n-1] + KnapsackMemo(val, wt, W-wt[n-1], n-1, dp) ;
            int ans2 = KnapsackMemo(val, wt, W, n-1, dp) ;
            dp[n][W] = Math.max(ans1, ans2) ;
            return dp[n][W] ;
        }else{
            dp[n][W] = KnapsackMemo(val, wt, W, n-1, dp) ;
            return dp[n][W] ;
        }
    }

    public static void printdp(int dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

    // Tabulation 
    public static int KnapsackTab(int val[], int wt[], int W){
        int n = val.length ;
        int dp[][] = new int[n+1][W+1] ;
        for(int i=0; i<dp.length; i++){             // 0th Col
            dp[i][0] = 0 ;
        }   
        for(int j=0; j<dp[0].length ; j++){         // 0th Row 
            dp[0][j] = 0 ;
        }
        
        for(int i=1; i<n+1; i++){
            for(int j=1 ; j<W+1; j++){
                int v = val[i-1] ;              // ith items value
                int w = wt[i-1] ;               // ith items weight
                if (w <= j) {           // Valid
                    int incProfit = v + dp[i-1][j-w] ;
                    int excProfit = dp[i-1][j] ;
                    dp[i][j] = Math.max(incProfit, excProfit) ;
                }else{
                    int excProfit = dp[i-1][j] ;
                    dp[i][j] = excProfit ;
                }
            }
        }
        printdp(dp) ;
        return dp[n][W] ;
    }


    public static void main(String[] args) {
        int val[] = {15,14,10,45,30} ;
        int wt[] = {2,5,1,3,4} ;
        int W = 7 ;
        int dp[][] = new int[val.length+1][W+1] ;

        for(int i=0 ; i<dp.length ;i++){
            for(int j=0; j<dp[0].length ; j++){         // Initialization 
                dp[i][j] = -1 ; 
            }
        }

        System.out.println(Knapsack(val, wt, W, val.length));
        System.out.println(KnapsackMemo(val, wt, W, val.length, dp));
        System.out.println(KnapsackTab(val, wt, W));
    }
}
