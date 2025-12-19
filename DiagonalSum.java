public class DiagonalSum {
    
    public static void main(String args[]){
        int mat[][] = {{1,2,3,4} ,
        {5,6,7,8} ,
        {9,10,11,12} ,
        {13,14,15,16}} ;

        System.out.println(Diagonalsum(mat)) ;
        System.out.println(diagonalsum2(mat));
    }

    public static int Diagonalsum(int mat[][]){     // TC O(n^2)
        int sum = 0 ;
        //for primary diagonal 
        for(int i=0 ; i<mat.length ; i++){
            for(int j=0 ; j<mat[0].length ; j++){
                if(i==j){
                    sum= sum + mat[i][j] ;
                }
                else if(i+j == mat.length-1){
                   sum += mat[i][j] ; 
                }
            }
        }
        return sum ;
    }

    public static int diagonalsum2(int mat[][]){   // TC O(n)
        int sum = 0 ;
        for(int i=0 ; i<mat.length ; i++){
            //primary diagonal 
            sum += mat[i][i] ;
            //secondary diagonal
            if(i != mat.length-i-1)
            sum += mat[i][mat.length-i-1] ;
        }
        return sum ;
    }
}
