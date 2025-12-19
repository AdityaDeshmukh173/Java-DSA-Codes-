import java.util.Scanner;

public class Patterns {
    
    public static void hollow_rect(int rows, int col ){
        for(int i=1 ; i<=rows;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || i==rows || j==1 || j==col ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_star_pyramid(int rows){
        int ro = rows ;
        for(int i= 1 ; i<=ro; i++){
            
            for(int k=1 ; k<=ro-i ;k++){
                System.out.print("  ");
            }

             for(int j =1 ;j<=i ;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void middle_star_pyramid(int rows){
        int ro = rows ;
        for(int i= 1 ; i<=ro; i++){
            
            for(int k=1 ; k<=ro-i ;k++){
                System.out.print(" ");
            }

             for(int j =1 ;j<=i ;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void inverted_numbers_pattern(int number){
        int num=number ;
        for(int i=1 ;i<=num ; i++){
            for(int j=1; j<=num-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floyds_triangle(int no){
        int x=1 ;
        for(int i=1; i<=no; i++){
            for(int j=1;j<=i; j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }

    public static void triangle_0_1(int rows){

        for(int i=1; i<=rows;i++){
            for(int j=1; j<=i;j++){
                if((i+j)%2 ==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void ButterflyPattern(int n){
            //1st half
        for(int i=1 ; i<=n ;i++){
            //stars i
            for(int j=1; j<=i ;j++){
                System.out.print("* ");
            }
            //spaces - 2*(n-i)
            for(int j=1 ;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //stars i 
            for(int j=1 ; j<=i ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
            //2nd half
        for(int i=n ;i>=1; i--){
             //stars i
             for(int j=1; j<=i ;j++){
                System.out.print("* ");
            }
            //spaces - 2*(n-i)
            for(int j=1 ;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //stars i 
            for(int j=1 ; j<=i ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    public static void rhombus(int n){
        for(int i=1 ; i<=n ;i++){
            //spaces 
            for(int j=1 ;j<=n-i ;j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1 ;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        for(int i=1 ;i<=n ;i++){
            //space
            for(int j=1 ;j<=n-i ;j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1 ;j<=n ;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond_pattern(int n){
        //1st half
        for(int i=1 ;i<=n ; i++){
            //spaces 
            for(int j=1; j<=(n-i);j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1 ;j<=(2*i)-1 ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n ;i>=1 ;i--){
            //spaces 
            for(int j=1; j<=(n-i);j++){
                System.out.print("  ");
            }
            //stars
            for(int j=1 ;j<=(2*i)-1 ;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
      /*  System.out.println("Enter no of rows and coloumn: ");
        int ro = sc.nextInt();
        int co = sc.nextInt();

        hollow_rect(ro, co);
        */
       
       /*  System.out.println("Enter no of rows");
        int ro = sc.nextInt();
        inverted_star_pyramid(ro);
*/
    /*   System.out.println("Enter no of rows: ");
        int num = sc.nextInt();
        inverted_numbers_pattern(num);
        sc.close();
      */    
      /* System.out.println("Enter no of rows: ");
        int num = sc.nextInt();
        floyds_triangle(num);
      */

       /* System.out.println("Enter no of rows: ");
        int num = sc.nextInt();
        triangle_0_1(num);
         */
        
    //     ButterflyPattern(7);
    //        rhombus(8);
    //        hollow_rhombus(7);
            diamond_pattern(8);
    }
}
