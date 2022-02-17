package LeetCode.String;

public class Task709 {
    public static void main(String[] args) {
        String s = "Hello";
        String ss = "";
        for (int i = 0; i < s.length(); i++) {
            ss = ss + s.charAt(i);
            ss = ss.toLowerCase();
        }
    }
}
