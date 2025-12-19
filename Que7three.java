import java.util.Scanner;

public class Que7three {
    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of a pencil, a pen and an eraser.");
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        
        float total = pencil+pen+eraser ;
        System.out.println("The total cost is "+total);
        float gst = total + (total*18)/100 ;
        System.out.println("price with gst is "+gst);
    }
}