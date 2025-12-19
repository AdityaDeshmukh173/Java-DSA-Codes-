public class StaircaseSearch {
    
    public static void main(String arsg[]){
        int matrix[][] = {{10, 20, 30, 40} ,
                          { 15, 25, 35, 45} , 
                          {27, 29, 37, 48} ,
                          {32, 33, 39, 50}} ;
        int key = 40 ;
        staircasesearch(matrix, key) ;
        leftcornerstarircase(matrix, key) ;
    }

    public static boolean staircasesearch(int mat[][] , int key){       //O(n+m)
        int row = 0 , col = mat[0].length-1 ;
        
        while(row < mat.length && col >=0){
            
            if(mat[row][col] == key){
                System.out.println("Found The Key at ("+row+","+col+")");
                return true ;
            }
            
            else if(mat[row][col] > key){
                col-- ;
            }
            else{
                row++ ;       
            }
        }
        System.out.println("The key is not present in this Array !!");
        return false ;
    }

    public static boolean leftcornerstarircase(int mat[][] , int key){     //O(n+m)
        int row = mat.length-1 , col=0 ;
        
        while(row>=0 && col<mat[0].length){
            if(mat[row][col] == key){
                System.out.println("The key is "+row+","+col);
                return true;
            }
            else if(mat[row][col] > key){
                row-- ;
            }
            else{
                col++ ;
            }
        }
        System.out.println("The key not found !!");
        return false ;
    }
}
