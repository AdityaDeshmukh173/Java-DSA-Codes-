public class nQueensonly1 {
    
    public static boolean isSafe(char board[][], int row ,int col){
        //verical up 
        for(int i=row-1 ; i>=0 ; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //diago right up
        for(int i=row-1 ,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //diago left up
        for(int i=row-1,j=col+1; i>=0 && j<board[0].length ; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        } 
        return true;
    }
    
    public static boolean nQueens(char board[][], int row){
        //base 
        if(row == board.length){
            //PrintBoard(board);
            count++;
            return true;
        }
        //column loop
        for(int j=0 ; j<board.length ; j++){
            if(isSafe(board,row,j)){
                board[row][j] = 'Q';
                if(nQueens(board, row+1)){             //fn call
                    return true;
                }   
                board[row][j] = 'X';          //backtracking step 
            }
        }
        return false ;
    }
    public static void PrintBoard(char board[][]){
        System.out.println("______CHESS-BOARD_______");
        for(int i=0; i<board.length ; i++){
            for(int j=0 ; j<board.length ; j++){
                System.out.print(board[i][j]+" ");
            }
        System.out.println();
        }
    }

    static int count =0 ;
    public static void main(String args[]){
        int n=2;
        char board[][] = new char[n][n];
        //Initialize 
        for(int i=0 ; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]= 'X' ;
            }
        }

        if(nQueens(board,0)){
            System.out.println("Solution is Possible ");
            PrintBoard(board);
        }else{
            System.out.println("Solution is Not Possible");
        }
//        System.out.println("Total ways to solve nQueens problem is : "+count);
    }
}
