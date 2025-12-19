import java.util.Scanner;

public class Tenthree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number you want Factorial of:");
        int number = sc.nextInt();
        double fact=1;

        for(int i=1 ; i<=number ; i++){
            fact=fact*i;
        }

        System.out.println("The Factorial of "+number+" is "+fact);
    }
}
