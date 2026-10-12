package _10_Recursion_And_Backtracking;
public class _07_MAZE_path {
    public static int print(int n , int m){
        int rw = 0;
        int dw = 0;
        if (n==1 && m==1) return 1;
        if (n==1) rw += print(n,m-1);
        if (m==1) dw += print(n-1,m);
        if (n>1 && m>1){
            rw += print(n,m-1);
            dw += print(n-1,m);
        }
        int tw = rw+dw;
        return tw;
    }
    public static void main(String[] args) {
        int r = 3;
        int c = 3;
        System.out.print(print(r,c));
    }
}
