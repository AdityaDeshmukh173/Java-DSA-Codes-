import java.util.Scanner;

import javax.print.event.PrintEvent;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class revno {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;

     //   int num = 10899 , sum=0;

    /*     for(int i=0 ; i<4 ; i++)
        {   
            sum = sum + num%10 ;
            num = num/10 ;
        }
        System.out.println(sum);
    */
       // for(int i=0 ; i<4 ; i++)
        //{
        //   System.out.print(num%10);
        //    num=num/10;
        //}

        System.out.println("Enter the no you want to reverse : ");
        int num = sc.nextInt();
        
            int rev = 0 ;
        while(num>0)
        {   
            rev = rev*10 + num%10 ;
            num=num/10 ;
            
        }
        System.out.print(rev);
    }
}
