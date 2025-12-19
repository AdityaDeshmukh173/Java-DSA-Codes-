public class PrintPrime {

    public static boolean isprime(int n){

        //only for >= 2 ;
        // for 2 
        if(n==2){
            return true;
        }
        
        boolean isprime = true;
        for(int i=2; i<=Math.sqrt(n) ; i++){ //completely dividing 
            if(n % i == 0){
                isprime= false ;
            }
        }
        return isprime ;
    }

    public static void PrintPrim (int n){
        for(int i=2 ; i<=n ;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        PrintPrim(100);
    }
}