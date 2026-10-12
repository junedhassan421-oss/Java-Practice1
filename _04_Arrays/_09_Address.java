package _04_Arrays;

public class _09_Address {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        //int sum = 0;
        //int product = 1;
        //int max = a[0];
        int min = a[0];
        for (int i=0;i<a.length;i++){
            //System.out.printf("%p\n",&a[i]);
            /*sum += a[i];*/
            /*product *= a[i];*/
            /*if (max<a[i]){
                max = a[i];
            }*/
            if (min>a[i]){
                min = a[i];
            }

        }
        /*System.out.print(sum);*/
        //System.out.print(product);
        //System.out.print(max);
        System.out.print(min);
    }
}
