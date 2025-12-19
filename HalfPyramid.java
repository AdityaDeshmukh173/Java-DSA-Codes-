import java.util.Scanner;

public class HalfPyramid {
    public static void main(String args[]){

        Scanner sc = new Scanner (System.in) ;

        System.out.println("Enter the number.");
        int lines = sc.nextInt();

        for(int i=1 ; i<=lines ;i++){
            for(int j =1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}