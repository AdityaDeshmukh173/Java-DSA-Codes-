import java.util.Scanner;

public class JavaInternals {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String example ;
        System.out.println("Enter the String : ");
        example = sc.nextLine() ;
        StringBuffer Buffer = new StringBuffer(example);
        System.out.println("Initial : "+Buffer);
        Buffer.append("Extended Text");
        System.out.println("Extended : "+Buffer);
    }
}



