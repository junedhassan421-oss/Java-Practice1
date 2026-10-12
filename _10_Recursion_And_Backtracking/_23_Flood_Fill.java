package _10_Recursion_And_Backtracking;
import java.util.Scanner;
public class _23_Flood_Fill {
    public static void floodfill(int [][]maze, int r,int c,String str,boolean isvisited[][]){
        if (r<0 || c<0 || r == maze.length || c == maze[0].length || maze[r][c] == 1 || isvisited[r][c] == true){
            return;
        }
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(str+" ");
            return;
        }
        isvisited[r][c] = true;
        floodfill(maze,r-1,c,str+'t',isvisited);
        floodfill(maze,r,c-1,str+'l',isvisited);
        floodfill(maze,r+1,c,str+'d',isvisited);
        floodfill(maze,r,c+1,str+'r',isvisited);
        isvisited[r][c] = false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int n = sc.nextInt();
        System.out.print("Enter the column : ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];

        System.out.println("Enter the matrix elements 1 and 0 elements : ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        boolean [][]isVisited = new boolean[n][m];
        floodfill(arr,0,0,"",isVisited);
    }
}
