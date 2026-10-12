package _10_Recursion_And_Backtracking;
import java.util.Scanner;
public class _06_Maze_Path {
    public static int maze(int sr, int sc, int er, int ec){
        int rightways = 0;
        int downways = 0;
        if (sr==er&&sc==ec){
            return 1;
        }
        if (sr==er){
            rightways += maze(sr,sc+1,er,ec);
        }
        if (sc==ec){
            downways += maze(sr+1,sc,er,ec);
        }
        if (sr<er&&sc<ec){
            rightways += maze(sr,sc+1,er,ec);
            downways += maze(sr+1,sc,er,ec);
        }
        int totalways = rightways+downways;
        return totalways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row : ");
        int r = sc.nextInt();
        System.out.print("Enter column : ");
        int c = sc.nextInt();
        System.out.println(maze(1,1,r,c));
    }
}
