package _08_Methode_Overloading;

public class _01_Change_The_Data {
//    static int /*void*/  change(int a){
//        a = 12;
//        return a;
//    }
    static void changed(int []brr){
        brr[0] = 105;
    }
    public static void main(String[] args) {
        /*int x = 45;
        change(x);
        System.out.println("The value of x after runing change is : " + x);*/ // pass by values // copy value

        int []arr = {52,73,77,89,98,94};
        changed(arr);
        System.out.println("The value of x after runing change is : " + arr[0]); // paas address of arr
        // pass by refrence or koi bhi object pass ho jata h to uska address pas hota h
    }

}
