package _10_Recursion_And_Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class _16_MAZE_path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Rows : ");
        int n = sc.nextInt();
        System.out.print("Enter the column : ");
        int m = sc.nextInt();

        ArrayList<String> paths = getmazepath(1,1,n,m);
        System.out.print(paths+" ");
    }
    public static ArrayList<String> getmazepath(int sr, int sc, int er, int ec){
        if (sr == er && sc == ec){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if (sc<ec){
            hpaths = getmazepath(sr,sc+1,er,ec);
        }
        if (sr<er){
            vpaths = getmazepath(sr+1,sc,er,ec);
        }
        ArrayList<String> paths = new ArrayList<>();
        for (String hpath : hpaths){
            paths.add("h"+hpath);
        }
        for (String vpath : vpaths){
            paths.add("v"+vpath);
        }
        return paths;
    }

}
