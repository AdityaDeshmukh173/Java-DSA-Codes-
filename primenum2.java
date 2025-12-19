public class primenum2 {
    
    public static boolean isprime(int n){

        //only for >= 2 ;
        // for 2 
        if(n==2){
            return true;
        }
        
        boolean isprime = true;
        for(int i=2; i<=n-1 ; i++){ //completely dividing 
            if(n % i == 0){
                isprime= false ;
            }
        }
        return isprime ;
    }

    public static void main(String args[]){
        System.out.println(isprime(10));
    }
}
