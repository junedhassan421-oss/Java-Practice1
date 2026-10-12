package _11_Backtracking;
//import java.util.Scanner;
public class _01_Tour_Knight_IsValid {
    public static boolean halper(int grid[][], int row, int cols, int nums){
        int n = grid.length;
        // base case
        if (grid[row][cols] == n*n-1) return true;


        int i , j;
        // 2 up 1 right
        i = row - 2;
        j = cols + 1;
        if (i>=0 && j<n && grid[i][j] == nums + 1) return halper(grid,i,j,nums+1);

        // 2 up 1 left
        i = row - 2;
        j = cols - 1;
        if (i>=0 && j>=0 && grid[i][j] == nums + 1) return halper(grid,i,j,nums+1);

        // 2 down 1 right
        i = row + 2;
        j = cols + 1;
        if (i<n && j<n && grid[i][j] == nums + 1) return halper(grid,i,j,nums+1);

        // 2 down 1 left
        i = row +  2;
        j = cols - 1;
        if (i<n && j>=0 && grid[i][j] == nums + 1) return halper(grid,i,j,nums+1);

        // 2 right 1 up
        i = row - 1;
        j = cols + 2;
        if (i>=0 && j<n && grid[i][j] == nums + 1) return halper(grid,i,j,nums+1);

        // 2 right 1 down
        i = row + 1;
        j = cols + 2;
        if (i<n && j<n && grid[i][j] == nums + 1) return halper(grid,i,j,nums+1);

        // 2 left 1 up
        i = row - 1;
        j = cols - 2;
        if (i>=0 && j>=0 && grid[i][j] == nums + 1) return halper(grid,i,j,nums+1);

        // 2 left 1 down
        i = row + 1;
        j = cols - 2;
        if (i<n && j>=0 && grid[i][j] == nums + 1) return halper(grid,i,j,nums+1);

        return false;
    }
    public static boolean Validknight(int grid[][]){
        if (grid[0][0] != 0) return false;
        return halper(grid,0, 0, 0);
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int knight[][] =
                {{0,11,16,5,20},
                {17,4,19,10,15},
                {12,1,8,21,6},
                {3,18,23,14,9},
                {24,13,2,7,22}};
        /*Validknight(knight);*/
        System.out.println( Validknight(knight));

    }
}
