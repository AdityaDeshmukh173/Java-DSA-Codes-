public class EditDistance {
    
    public static int editdist(String s1, String s2){           // TC = O(n*m)
        int n = s1.length() ;
        int m = s2.length() ;
        int dp[][] = new int[n+1][m+1] ;
        //Initialization
        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if (i == 0) {
                    dp[i][j] = j ;
                }
                if (j == 0) {
                    dp[i][j] = i ;
                }
            }
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if (s1.charAt(i-1) == s2.charAt(j-1)) {     //Same
                    dp[i][j] = dp[i-1][j-1] ;
                }else{                                      //Diff
                    // dp[i][j] = Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1])) + 1 ;
                    int add = dp[i][j-1] + 1 ;
                    int del = dp[i-1][j] + 1 ;
                    int rep = dp[i-1][j-1] + 1 ;
                    dp[i][j] = Math.min(add, Math.min(del, rep)) ;
                }
            }
        }
        return dp[n][m] ;   
    }
    
    public static void main(String[] args) {
        String word1 = "intention" ;
        String word2 = "execution" ;

        System.out.println(editdist(word1, word2));
    }
}
