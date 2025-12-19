import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class ifelsetax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
        int income = sc.nextInt();

        if(income< 500000){
            System.out.println("You have to pay 0% Tax");
        }
        else if(income>= 500000 && income <1000000){
            System.out.println("You have to pay 20% Tax of "+income+"that is : "+(income*0.2));
        }
        else {
            System.out.println("You have to pay 30% Tax of "+income+"that is : "+(income*0.3));
        }
    }
}
