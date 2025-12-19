import java.util.Scanner;

import javax.print.event.PrintEvent;

public class enternum {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers: ");
        int num ;
       /*  do{
            num = sc.nextInt();
           System.out.println(num); 
        }
        while(num%10 != 0);
*/
      /*   do{
            num = sc.nextInt();
            if(num%10 == 0){
                break ;
            }
            System.out.println(num); 
        }while(true);
        */

        do{
            num = sc.nextInt();
            if(num%10 == 0){
                continue ;
            }
            System.out.println(num);
        }while(true) ;
    }

}
