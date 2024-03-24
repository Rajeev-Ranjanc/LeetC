//https://www.geeksforgeeks.org/problems/insert-an-element-at-the-bottom-of-a-stack/1

import java.util.Stack;

public class InsertLastOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int x = 2;
        st.add(4);
        st.add(3);
        st.add(2);
        st.add(1);
        st.add(8);
        System.out.println(insertAtBottom(st, x));
    }

    public static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> str = new Stack<>();
        while (!st.empty()){
            str.push(st.pop());
        }
        System.out.println(st);
        st.push(x);
        while (!str.empty()){
            st.push(str.pop());
        }
        return st;
    }
}
