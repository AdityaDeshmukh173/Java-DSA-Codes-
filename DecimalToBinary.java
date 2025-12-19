public class DecimalToBinary {
    public static void main(String args[]){
        Function(8);
    }

    public static void Function(int n){
        int deci = n ;
        int power=0 ;
        int binary = 0 ;

        while(n > 0){
            int remainder = n % 2 ;
            binary = binary + (remainder * (int)Math.pow(10, power)) ;

            power++ ;
            n = n/2 ;
        }
        System.out.println("Binary of "+deci+" is "+binary);
    }
}
