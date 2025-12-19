import java.util.Scanner;

public class BinomialCorff {
    
    public static int factorial(int n){
        int f =1 ;
        for(int i=1 ; i<= n;i++){
            f=f*i ;
        }
        return f ;
    }
    
    public static int Binomial(int n ,int r){
        int nfact = factorial(n);
        int rfact = factorial(r);
        int tfact = factorial((n-r));
        
        int bino= nfact/(rfact*tfact);
        return bino;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n for the formula: ");
        int n = sc.nextInt();
        System.out.println("Enter r for the formula: ");
        int r = sc.nextInt();

        int ans = Binomial(n, r);
        System.out.println(ans);
    }
}
