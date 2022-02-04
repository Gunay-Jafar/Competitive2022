package LeetCode.String;

//https://leetcode.com/problems/count-the-number-of-consistent-strings/submissions/
public class Task1684 {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = new String[]{"ad", "bd", "aaab", "baa", "badab"};

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (!allowed.contains(String.valueOf(words[i].charAt(j)))) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(words.length - count);
    }
}
