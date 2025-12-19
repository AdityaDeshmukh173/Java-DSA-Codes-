public class TargetSum {
    
    //  Tabulation                  TC = O(n*sum)
    public static boolean tatgetSum(int arr[], int sum){
        int n = arr.length ;
        boolean dp[][] = new boolean[n+1][sum+1] ;
        // i = items & j = target sum 
        for(int i=0; i<n+1; i++){
            dp[i][0]  = true ;          // We dont need to initialize False conditions as Java already initializes as False
        }
        
        for(int i=1; i<n+1 ; i++){
            for(int j=1; j<sum+1; j++){
                int v = arr[i-1] ;
                // Include 
                if (v <= j && dp[i-1][j-v] == true) {
                    dp[i][j] = true ;
                }
                // Exclude 
                else if (dp[i-1][j] == true) {
                    dp[i][j] = true ;
                }
            }
        }

        printdp(dp);
        return dp[n][sum] ;
    }

    public static void printdp(boolean[][] dp){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,2,7,1,3} ;
        int target = 10 ;
        System.out.println(tatgetSum(arr, target));
    }

}
