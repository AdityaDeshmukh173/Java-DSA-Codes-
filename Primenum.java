import java.util.*;;

public class Primenum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number till you want to find prime no.");
        int num = sc.nextInt();

        if(num==2){
            System.out.println("2 is prime.");
        }
        else{

            boolean prime = true ;  //to store the ans if true or false .
            
            for(int i =2 ; i<Math.sqrt(num) ;i++){        // i< num-1
                if(num%i == 0){  //n is multiple of i 
                    prime=false;
                }
                
            }
            
            if(prime==true){
                System.out.println(num+" is Prime.");
            }
            else{
                System.out.println(num+" is not Prime.");
            }
        }
    }
}
