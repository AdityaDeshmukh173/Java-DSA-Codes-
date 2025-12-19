public class BinaryToDecimal {
    public static void main(String[] args) {
    
      //  System.out.println("The no is 001");
        binTodec(100);
    }

    public static void binTodec(int Binnum){
        int binary = Binnum ;
        int power = 0 ;
        int Decim = 0 ;
        System.out.println("Inside loop");

        while(Binnum > 0){
            int Lastdigit = Binnum % 10 ;
            Decim = Decim + (Lastdigit * (int)Math.pow(2, power)) ;

            power++ ;
            Binnum = Binnum / 10 ;
        }

        System.out.println("Decimal no. of "+binary+" is "+Decim);
    }

}