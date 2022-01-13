package LeetCode.Arrays;

//https://leetcode.com/problems/running-sum-of-1d-array/submissions/
public class Task1480 {

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
