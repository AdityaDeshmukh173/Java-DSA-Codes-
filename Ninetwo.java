import java.util.Scanner;

public class Ninetwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your body temperature.");
        int temp = sc.nextInt();

        if(temp>100){
            System.out.println("You have Fever.");
        }
        else{
            System.out.println("You dont have Fever.");
        }
        sc.close();
    }
    
}
