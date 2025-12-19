import java.util.*;

public class Starpatt {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How many lines you want.");
        int lines = sc.nextInt();
        
        for(int i=1 ; i<=lines ; i++){
            for(int star=1 ; star<=i ;star++){
                System.out.print("*");
            }       
            System.out.println();
        }
        System.out.println();
        for(int i=1 ; i<=lines ;i++){
            for(int star=1 ; star<=lines-i+1 ; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
