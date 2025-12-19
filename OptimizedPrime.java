public class OptimizedPrime {
    
    // n = root(n) * root(n)
    // so max value to check is root(n)
    public static boolean Optprime(int n){
        
        if(n==2){
            return true;
        }

        for(int i=2 ; i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false ;
            }
        }
        return true ;
    }

    public static void main(String[] args) {
        System.out.println(Optprime(11));
    }

}
