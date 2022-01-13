package LeetCode.Arrays;

public class Task1929 {
    //https://leetcode.com/problems/concatenation-of-array/submissions/

    public int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length) {
                arr[i] = nums[i];
            } else {
                arr[i] = nums[i - nums.length];
            }
        }
        return arr;
    }
}
