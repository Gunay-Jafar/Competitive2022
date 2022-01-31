package LeetCode.String;

//https://leetcode.com/problems/split-a-string-in-balanced-strings/submissions/
public class Task1221 {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        int count = 0;
        int balance = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R')
                balance++;
            else
                balance--;

            if (balance == 0)
                count++;

        }

        System.out.println(count);
    }
}
