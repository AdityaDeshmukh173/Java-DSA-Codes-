import java.util.*;

public class Matrices  {
    
    public static void main(String args[]){

        int mat[][] = new int[3][3] ;
        int n=3 , m=3 ;         // OR    n = mat.length ,   m = mat[0].length ;

        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i< n ; i++){
            for(int j=0 ; j<m ; j++){
                mat[i][j]= sc.nextInt();
            }
        }
        //Output
        for(int i=0 ; i< n ; i++){
            for(int j=0 ; j<m ; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        
        Search(mat, 5) ;

    }

    public static boolean Search(int mat[][] , int key ){
        

        for(int i=0 ; i<mat.length ; i++){
            for(int j=0 ; j<mat[0].length ; j++){
                if(mat[i][j] == key ){
                    System.out.println("Found at cell ("+i+", "+j+") ");
                    return true ;
                }
            }
        }   
        System.out.println("Key not found");
        return false ;
    }

}
