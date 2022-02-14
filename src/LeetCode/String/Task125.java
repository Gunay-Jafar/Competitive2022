package LeetCode.String;

public class Task125 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                builder.append(Character.toLowerCase(s.charAt(i)));
            }
        }

        s = builder.toString();
        int count = s.length();

        for (int i = 0; i < count / 2; i++) {
            if (s.charAt(i) != s.charAt(count - 1 - i)) {
                //   return false;
            }
        }

        //   return true;
    }
}

