package _10_Recursion_And_Backtracking;
import java.util.ArrayList;
import java.util.Scanner;
public class _17_Maze_Path_Jump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : ");
        int r = sc.nextInt();
        System.out.print("Enter the column : ");
        int c = sc.nextInt();

        ArrayList<String> paths = getpaths(1,1,r,c);
        System.out.println(paths);

    }
    public static ArrayList<String> getpaths(int sr, int sc,int er,int ec){
        if (sr == er && sc == ec){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> path = new ArrayList<>();

        // horizontal moves
        for (int ms = 1; ms<=ec-sc; ms++){
            ArrayList<String> hpaths = getpaths(sr,sc+ms,er,ec);
            for (String hpath : hpaths){
                path.add("h" + ms+ hpath);

            }
        }
        // vertical moves
        for (int ms = 1; ms<=er-sr;ms++){
            ArrayList<String> vpaths = getpaths(sr+ms,sc,er,ec);
            for (String vpath : vpaths){
                path.add("v"+ms+vpath);
            }
        }
        for (int ms = 1;ms<=er-sr && ms<=ec-sc;ms++){
            ArrayList<String> dpaths = getpaths(sr+ms,sc+ms,er,ec);
            for (String dpath : dpaths){
                path.add("d"+ms+dpath);
            }
        }
        return path;
    }
}
