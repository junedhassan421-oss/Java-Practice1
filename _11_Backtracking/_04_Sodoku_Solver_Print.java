package _11_Backtracking;

public class _04_Sodoku_Solver_Print {
    public static boolean isValide(char[][] board, int row, int cols, char nums){
        // check row
        for (int j=0;j<9;j++){
            if ( board[row][j] == nums) return false;
        }
        // check column
        for (int i=0;i<9;i++){
            if (board[i][cols] == nums) return false;
        }
        // check 3x3 greed
        /*int sRow = row/3*3;
        int sCols = cols/3*3;*/
        int sRow = 3*(row/3);
        int sCols = 3*(cols/3);
        for (int i=sRow;i<sRow+3;i++){
            for (int j=sCols;j<sCols+3;j++){
                if (board[i][cols] == nums) return false;
            }
        }
        return true;

    }
    public static char[][] solver(char [][]board,int row, int cols,char [][]grid){
        if (row==9){
            for (int i=0;i<9;i++){
                for (int j=0;j<9;j++){
                    // System.out.print(board[i][j]);
                    grid[i][j] = board[i][j];

                }

            }
            return grid;
        }
        else if (board[row][cols] != '.'){
            // continue
            if (cols!=8) solver(board,row,cols+1,grid);
            else solver(board,row+1,0,grid);

        } // board[row][cols] == '.';
        else {
            for (char ch = '1'; ch<='9'; ch++){
                if (isValide(board,row,cols,ch)){
                    board[row][cols] = ch;
                    if (cols!=8) solver(board,row,cols+1,grid);
                    else solver(board,row+1,0,grid);
                    board[row][cols] = '.'; // Backtracking
                }
            }
        }
        return grid;
    }
    public static char[][] isValideSoduku(char [][]board){
        char [][] grid = new char[9][9];
        solver(board,0,0,grid);
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                board[i][j] = grid[i][j];

            }

        }
        return board;
    }
    public static void main(String[] args) {
        char [][]board =
                        {{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}};
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        //System.out.println(isValideSoduku(board));
        char chare[][] =  isValideSoduku(board);
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                System.out.print(chare[i][j]);
            }
            System.out.println();
        }

    }
}
