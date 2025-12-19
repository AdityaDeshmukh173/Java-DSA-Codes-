import java.security.cert.PKIXCertPathValidatorResult;
import java.util.Scanner;

public class Funcmultiply {
    public static int Multiply(int a,int b){
        int mul = a*b ;
        return mul;
    }
    
    public static int Factorial(int a){
        int f=1;
        for(int i=1 ; i<=a ;i++){
            f = f*i ;
        }
        return f ;
    }

    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int ans = Multiply(a, b);
        System.out.println(ans);

        System.out.println("Enter Num for Facyorial:");
        int c = sc.nextInt();
        int fact = Factorial(c);
        System.out.println(fact);
    }
}
