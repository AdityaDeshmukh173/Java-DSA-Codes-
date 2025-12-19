public class LongestCommonSubstring {

    public static int LCSubstring(String s1, String s2){                    // TC = O(n*m)
        int n = s1.length() ;
        int m = s2.length() ;
        int dp[][] = new int[n+1][m+1] ;
        int ans = 0 ;

        // Initialize
        for(int i=0; i<n+1; i++){
            dp[i][0] = 0 ;
        } 
        for(int j=0; j<m+1; j++){
            dp[0][j] = 0 ;
        }

        // Bottom Up 
        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1 ;
                    ans = Math.max(ans, dp[i][j]) ;
                }else{
                    dp[i][j] = 0 ;
                }
            }
        }
        return ans ;
    }

    public static void main(String[] args) {
        String s1 = "ABCDE" ;
        String s2 = "ABGCE" ;

        System.err.println(LCSubstring(s1, s2));
    }
}
