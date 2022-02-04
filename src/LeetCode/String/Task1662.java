package LeetCode.String;

//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/submissions/
public class Task1662 {
    public static void main(String[] args) {
        String[] word1 = new String[]{"ab", "c"};
        String[] word2 = new String[]{"a", "bc"};

        String s1 = "";
        String s2 = "";
        for (int i = 0; i < word1.length; i++) {
            s1 = s1.concat(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            s2 = s2.concat(word2[i]);
        }

        if (s1.equals(s2))
            System.out.println(true);
        else System.out.println(false);

    }
}
