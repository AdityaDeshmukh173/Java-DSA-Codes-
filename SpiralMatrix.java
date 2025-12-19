public class SpiralMatrix {
    
    public static void main(String args[]) {
        int mat[][] = {{1,2,3,4} ,
                        {5,6,7,8} ,
                        {9,10,11,12} ,
                        {13,14,15,16}} ;

        PrintSpiral(mat);
    }

    public static void PrintSpiral(int matrix[][]){
        int strow = 0 ;
        int stcol = 0 ;
        int endrow = matrix.length-1 ;
        int endcol = matrix[0].length-1 ;

        while(strow <= endrow && stcol <= endcol){
            //Top Boundary 
            for(int j=stcol ; j<=endcol ; j++) {
                System.out.print(matrix[strow][j]+" ");
            }

            //Roght Boundary 
            for(int i=strow+1 ; i<=endrow ; i++){
                System.out.print(matrix[i][endcol]+" ");
            }

            //Bottom Boundary 
            for(int j=endcol-1 ; j>=stcol ;j--){ 
                if(strow == endrow){
                    break ;
                }
                System.out.print(matrix[endrow][j]+" ");
            }

            //Left Boundary 
            for(int i=endrow-1 ; i>=strow+1 ; i--){
                if (stcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][stcol]+" ");
            }

            strow++;
            stcol++;
            endrow--;
            endcol--;
        }
        System.out.println();
    }
}