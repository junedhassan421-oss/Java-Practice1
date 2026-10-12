package _12_Backtracking;
import java.util.ArrayList;
public class _06_GOLD_MINE {
    static int max = 0;
    public static void travelandcollectgold(int arr[][], int i, int j, boolean visited[][], ArrayList<Integer> bag){
        if (i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j] == 0 || visited[i][j] == true){
            return;
        }
        visited[i][j] = true;
        bag.add(arr[i][j]);
        travelandcollectgold(arr,i-1,j,visited,bag);
        travelandcollectgold(arr,i,j+1,visited,bag);
        travelandcollectgold(arr,i,j-1,visited,bag);
        travelandcollectgold(arr,i+1,j,visited,bag);
        visited[i][j] = false; // backtracking
    }
    public static void getmaxgold(int arr[][]){
        boolean [][] visited = new boolean[arr.length][arr[0].length];
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[i][j] != 0 && visited[i][j] == false){
                    ArrayList<Integer> bag = new ArrayList<>();
                    travelandcollectgold(arr,i,j,visited,bag);
                    int sum = 0;
                    for (int val: bag){
                        sum += val;
                    }
                    if (sum>max){
                        max = sum;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,0,1,2,0,8,0},
                       {2,0,0,0,0,6,0},
                       {3,0,0,9,1,3,4},
                       {4,0,2,5,8,3,1},
                       {0,0,0,0,0,9,0},
                       {5,6,7,0,7,4,2},
                       {8,9,1,0,1,1,8}};
        getmaxgold(arr);
        System.out.print(max);

    }
}
