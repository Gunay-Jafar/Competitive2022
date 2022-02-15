package LeetCode.String;

import java.util.Stack;

public class Task20 {
    public static void main(String[] args) {
        String s = "()[]{}";
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (st.isEmpty() && (ch == ')' || ch == '}' || ch == ']')) {
                //   System.out.println("false");
            }

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' && st.peek() == '(' || (ch == '}' && st.peek() == '{') ||
                    (ch == ']' && st.peek() == '[')) {
                st.pop();
            } else {
                //   return false;
            }
        }
        //  return st.isEmpty();
    }
}
