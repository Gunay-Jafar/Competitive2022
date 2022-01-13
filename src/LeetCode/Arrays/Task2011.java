package LeetCode.Arrays;
//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/submissions/

public class Task2011 {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(0) == '+' || (operations[i].charAt(2) == '+')) {
                count++;
            } else {
                count--;
            }
        }
        return count;
    }

}
