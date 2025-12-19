public class StringConversion {
    
    public static int LCS(String s1, String s2){
        int n = s1.length() ;
        int m = s2.length() ;
        int dp[][] = new int[n+1][m+1] ;

        for(int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++){
                if (i == 0 || j == 0) {
                    dp[i][j] = 0 ;
                }
            }
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<m+1; j++){
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1 ;
                }else{
                    dp[i][j] = Math.max( dp[i-1][j], dp[i][j-1]) ;
                }
            }
        }
        return dp[n][m] ;
    }

    public static int stringConv(String s1, String s2){
        int n = s1.length() ;
        int m = s2.length() ;

        int lcs = LCS(s1, s2) ;

        int del = n-lcs ;
        int add = m-lcs ;

        return add+del ;
    }

    public static void main(String[] args) {
        String w1 = "abcd" ;
        String w2 = "anc" ;        

        String str1 = "pear" ;
        String str2 = "sea" ;

        System.out.println(stringConv(w1, w2));
        System.out.println(stringConv(str1, str2)); 
    }
}
