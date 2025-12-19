import java.util.Scanner;

public class Nineone {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any no.");
        int input = sc.nextInt();
        
        if(input>= 0){
            System.out.println("The no is positive.");
        }
        else{
            System.out.println("The no is negative.");
        }

    }
}
