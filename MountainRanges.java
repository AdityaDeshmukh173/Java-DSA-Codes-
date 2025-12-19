public class MountainRanges {
    
    public static int mountainRanges(int n){    // Catalans  TC = O(n^2)
        int dp[] = new int[n+1] ;
        dp[0] = 1 ;
        dp[1] = 1 ;

        for(int i=2; i<n+1; i++){
            // i pairs -> mountain ranges => Ci
            for(int j=0; j<i; j++){
                int inside = dp[j] ;
                int outside = dp[i-j-1] ;
                dp[i] += inside * outside ;
                // dp[i] = dp[j] * dp[i-j-1] ;
            }
        }
        return dp[n] ;
    }

    public static void main(String[] args) {
        int n = 4 ; // 14
        System.out.println(mountainRanges(n));
    }
}
