package _12_Backtracking;
import java.util.Scanner;
public class _03_Friends_Pairing {
    static int counter = 1;
    public static void pairsfried(int i,int n, boolean []visit, String str){
        if (i>n){
            System.out.println(counter + "." + str);
            counter ++;
            return;
        }
        if (visit[i] == true){
            pairsfried(i+1,n,visit,str);
        }
        else {
            visit[i] = true;
            pairsfried(i+1,n,visit,str+"("+i+")");
            for (int j = i+1;j<=n;j++){
                if (visit[j] == false){
                    visit[j] = true;
                    pairsfried(i+1,n,visit,str+"("+i+","+j+")");
                    visit[j] = false;

                }
            }
            visit[i] = false;
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of friendship : ");
        int n = sc.nextInt();
        boolean bool[] = new boolean[n+1];
        pairsfried(1,n,bool,"");
    }
}
