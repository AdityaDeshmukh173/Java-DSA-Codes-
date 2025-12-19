import java.util.Scanner;

public class Tentwo {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number.");
        System.out.println("Enter 0 to Exit.");
        int sumeven=0 , sumodd=0 ;
        
        for(int i = 0 ;i <=100 ;i++){
            int num= sc.nextInt();
            if(num!=0){
                if(num%2==0){
                    sumeven=sumeven+num ;
                }
                else{
                    sumodd=sumodd+num ;
                }

            }else{break;}
        }
        System.out.println("The sum of Odd numbers is "+sumodd);
        System.out.println("The sum of Even numbers is "+sumeven);
    }
}
