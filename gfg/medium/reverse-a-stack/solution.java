import java.util.Stack;

class Solution {
    static void insertAtBottom(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }
        int top = s.pop();
        insertAtBottom(s, x);
        s.push(top);
    }

    static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        insertAtBottom(s, top);
    }
}
