package _04_Arrays;

public class _03_problem {
    public static void main(String[] args) {
        int []one = new int[5];
        one[0] = 45;
        one[1] = 48;
        one[2] = 47;
        one[3] = 55;
        one[4] = 90;

        int []two = one;
        two[1] = 60;

        for (int i=0;i<one.length;i++){
            System.out.print(one[i]+" ");
            //System.out.print(two[i]+" ");
        }
    }
}
