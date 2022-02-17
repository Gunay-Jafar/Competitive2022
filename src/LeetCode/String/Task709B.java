package LeetCode.String;

public class Task709B {
    public static void main(String[] args) {
        String s = "Salam";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(s.charAt(i))) {
                s = s.replace(ch, (char) (ch + 32));
            }
        }
    }
}
