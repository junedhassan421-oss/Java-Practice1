package _10_Recursion_And_Backtracking;
import java.util.Scanner;
public class _24_NQueens {
    public static void nQueen(int [][]chess,String asf,int row){
        if (row == chess.length){
            System.out.println(asf+",");
            return;
        }
        for (int col=0;col<chess.length;col++){
            if (isSafe(chess,row,col)){
                chess[row][col] = 1;
                nQueen(chess,asf+row+","+col+",",row+1);
                chess[row][col] = 0;
            }
        }
    }
    private static boolean isSafe(int[][]board,int row,int cols) {
        int n = board.length;
        for (int i = row-1, j=cols; i>=0; i--){
            if (board[i][j]==1){
                return false;
            }
        }
        for (int i = row-1, j=cols-1; i>=0 && j>=0; i--,j--){
            if (board[i][j]==1){
                return false;
            }
        }
        for (int i = row-1, j=cols+1; i>=0 && j<board.length; i--,j++){
            if (board[i][j]==1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of BOX : ");
        int n = sc.nextInt();
        int [][]chess = new int[n][n];
        nQueen(chess,"",0);
    }
}
