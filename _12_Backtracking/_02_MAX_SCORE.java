package _12_Backtracking;
import java.util.Scanner;
public class _02_MAX_SCORE {
    public static int solution(String[] words, int[] far ,int[] score, int idx){
        if (idx == words.length){
            return 0;
        }
        int scoreno = 0+solution(words,far,score,idx+1); // words note include
        int scoreword = 0;
        String word = words[idx];
        boolean flag = true; // true if yes call can be included
        for (int i=0;i<word.length();i++){
            char ch = word.charAt(i);

            if (far[ch - 'a'] == 0){
                flag = false;
            }
            far[ch - 'a']--;
            scoreword += score[ch - 'a'];
        }
        int syes = 0;
        if (flag){
            syes = scoreword+solution(words,far,score,idx+1);
        }
        for (int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            far[ch - 'a']++;
        }
        return Math.max(scoreno,syes);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of words : ");
        int nofwords = sc.nextInt();
        System.out.print("Enter the words : ");
        String []words = new String[nofwords];
        for (int i=0;i<words.length;i++){
            words[i] = sc.next();
        }
        int nofLetters = sc.nextInt();
        System.out.print("Enter the size of letters : ");
        char [] letter =  new char[nofLetters];
        System.out.print("Enter the letters : ");
        for (int i=0;i<letter.length;i++){
            letter[i] = sc.next().charAt(0);
        }

        int []score = new int[26];
        System.out.print("Enter the score : ");
        for (int i=0;i<score.length;i++){
            score[i] = sc.nextInt();
        }

        if (words == null || words.length == 0 || letter == null || letter.length == 0 || score == null || score.length == 0){
            System.out.println(0);
            return;
        }
        int[] far = new int[score.length];
        for (char ch : letter){
            far[ch - 'a'] ++;
        }
        System.out.println(solution(words,far,score,0));


    }
}
