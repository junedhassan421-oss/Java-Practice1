package _00_BASIC_Type_Casting;

public class _02_Type_Casting {
    public static void main(String[] args) {
        for (int i=65;i<=90;i++){
            /*char ch = (char) i;
            System.out.printf("%c ->",ch);
            System.out.printf("%d\n",i);*/

            char ch = (char) i;
            System.out.println(ch+"->"+i);

        }
        System.out.println();
        for (int i=97;i<=122;i++){
            char ch = (char) i;
            System.out.println(ch+"->"+i);

        }
    }
}
