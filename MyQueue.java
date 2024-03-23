//Queue implementation using 2 stack
//https://leetcode.com/problems/implement-queue-using-stacks/description/
import java.util.Stack;

public class MyQueue {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public MyQueue() {

        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {

        while (!s1.empty()) {

            s2.push(s1.pop());

        }

        s1.push(x);
        while (!s2.empty()) {
            s1.push(s2.pop());
        }

    }

    public int pop() {
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }
}