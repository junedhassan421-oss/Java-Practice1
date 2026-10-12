package Stack;
import java.util.Stack;
public class stackImplementation {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(50);
        st.push(1);
        st.push(90);
        st.push(45);

        System.out.println(st);

        System.out.println(st.peek() + " "+st.size());
    }
}
