package Stack;
import java.util.Scanner;
import java.util.Stack;
public class DuplicateBrace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mixed [BODMAS] number : ");
        String s = sc.nextLine();

        Stack<Character> st = new Stack<>();

        /*if (st.peek() == ')'){
            System.out.println("This is not valide " + false);
            return;
        }*/

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                if(st.peek() == '('){
                    System.out.println(true);
                    return;
                }
                else {
                    while (st.peek() != '('){
                        st.pop();
                    }
                    st.pop();
                }
            }
            else {
                st.push(ch);
            }
        }
        System.out.println(false);

    }
}
