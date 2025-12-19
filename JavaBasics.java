import java.util.*;

public class JavaBasics {

    public static int calculate(int a , int b){   //parameters or formal parameters 
        int sum = a + b ;
        return sum;
    }
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = calculate(a, b);    //arguments or actual parameters 
        System.out.println("Sum is "+sum);
    }
}
