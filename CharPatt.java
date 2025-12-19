import java.util.Scanner;

public class CharPatt {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int lines = sc.nextInt();
        char ch = 'A';

        for(int i=1 ; i<=lines ; i++){
            for(int chars=1 ; chars<=i ;chars++){
                System.out.print(ch);
                ch++ ;
            }
            System.out.println();
        }
    sc.close();}
    
}
