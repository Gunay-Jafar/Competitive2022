package LeetCode.Arrays;

 //https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/submissions/
public class Task2114 {
    public int mostWordsFound(String[] sentences) {
        int numResult = 0;
        for (int i = 0; i < sentences.length; i++) {
            int num = 1;
            String sentence = sentences[i];
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == ' ') {
                    num++;
                }
            }
            if (num > numResult) {
                numResult = num;
            } else {
                num = 1;
            }

        }
        return numResult;
    }
}
