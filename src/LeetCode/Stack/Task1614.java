package LeetCode.Stack;

import java.util.Stack;

public class Task1614 {
    public static void main(String[] args) {
        String s = "";
        Stack<Character> st = new Stack<>();
        int max = 0, count = 0;
        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, count);
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
                count++;// 1,2,3
            } else if (s.charAt(i) == ')') {
                st.pop();
                count--;
            }
        }
        // return max;
    }
}
