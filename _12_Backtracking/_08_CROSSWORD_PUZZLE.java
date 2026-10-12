package _12_Backtracking;
import java.util.Scanner;
public class _08_CROSSWORD_PUZZLE {
    public static void solution(char board[][], String[] words, int vidx){
        if (vidx == words.length){
            display(board);
            return;
        }
        String word = words[vidx];
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board.length;j++){
                if (board[i][j] == '_' || board[i][j] == word.charAt(0)){
                    if (can_place_word_Horizantically(board,word,i,j)){
                        boolean []vplaced = place_Word_Horizantically(board,word,i,j);
                        solution(board,words,vidx+1);
                        unplace_word_Horizantically(board,vplaced,i,j);
                    }

                    if (can_place_word_vertically(board,word,i,j)){
                        boolean []vplaced = place_Word_vertically(board,word,i,j);
                        solution(board,words,vidx+1);
                        unplace_word_vertically(board,vplaced,i,j);
                    }

                }
            }
        }
    }
    public static boolean can_place_word_Horizantically(char board[][], String words, int i, int j){
        if (j-1>=0 && board[i][j-1] != '+'){ // + hona chahiye
            return false;

        }
        else if (j+words.length() < board[0].length && board[i][j + words.length()] != '+'){  // words String ke end idx ke just ek aage wala idx jo + hona zaruri h
           return false;
        }
        for (int jj =0;jj<words.length();jj++){
            if (j+jj >= board[0].length){
                return false;
            }
            if (board[i][j+jj] == '_' || board[i][j+jj] == words.charAt(jj)){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static boolean can_place_word_vertically(char board[][], String words, int i, int j){
        if (i-1>=0 && board[i-1][j] != '+'){ // + hona chahiye
            return false;

        }
        else if (i+words.length() < board.length && board[i+ words.length()][j] != '+'){  // words String ke end idx ke just ek aage wala idx jo + hona zaruri h
            return false;
        }
        for (int ii =0;ii<words.length();ii++){
            if (i+ii >= board.length){
                return false;
            }
            if (board[i+ii][j] == '_' || board[i+ii][j] == words.charAt(ii)){
                continue;
            }
            else {
                return false;
            }
        }
        return true;
    }
    public static boolean[] place_Word_vertically(char board[][],String word, int i, int j){

        boolean[] vplaced = new boolean[word.length()];
        for (int ii=0; ii<word.length(); ii++){
            if (board[i+i][j]=='_'){
                board[i+ii][j] = word.charAt(ii);
                vplaced[ii] = true;
            }
        }
        return vplaced;
    }
    public static void unplace_word_vertically(char board[][], boolean vplaced[],int i, int j){
        for (int ii=0; ii<vplaced.length; ii++){
            if (vplaced[ii] == true){
                board[i+ii][j] = '_';
            }
        }
    }
    public static boolean[] place_Word_Horizantically(char board[][],String word, int i, int j){

        boolean[] vplaced = new boolean[word.length()];
        for (int jj=0; jj<word.length(); jj++){
            if (board[i][j+jj]=='_'){
                board[i][j+jj] = word.charAt(jj);
                vplaced[jj] = true;
            }
        }
        return vplaced;
    }
    public static void unplace_word_Horizantically(char board[][], boolean vplaced[],int i, int j){
        for (int jj=0; jj<vplaced.length; jj++){
            if (vplaced[jj] == true){
                board[i][j+jj] = '_';
            }
        }
    }

    public static void display(char board[][]){
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board.length;j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Enter the size of BOX : ");
        int n = sc.nextInt();
        char[][] arr = new char[n][n];
        for (int i=0;i<arr.length;i++){
            String str = sc.next();
            arr[i] = str.toCharArray();
        }*/

        char arr[][] =
                {{'+','_','+','+','+','+','+','+','+','+'},
                 {'+','_','+','+','+','+','+','+','+','+'},
                 {'+','_','+','+','+','+','+','+','+','+'},
                 {'+','_','_','_','_','_','+','+','+','+'},
                 {'+','_','+','+','+','_','+','+','+','+'},
                 {'+','_','+','+','+','_','+','+','+','+'},
                 {'+','+','+','+','+','_','+','+','+','+'},
                 {'+','+','_','_','_','_','_','_','+','+'},
                 {'+','+','+','+','+','_','+','+','+','+'},
                 {'+','+','+','+','+','_','+','+','+','+'}};

        System.out.print("Enter the Words size : ");
        int m = sc.nextInt();
        String word[] = new String[m];
        for (int i=0;i<word.length;i++){
            word[i] = sc.next();
        }

        solution(arr,word,0);
    }
}
