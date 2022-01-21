package LeetCode.Arrays;

//https://leetcode.com/problems/number-of-good-pairs/submissions/
public class Task1512 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 1};
        int numIdenticalPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j)
                    numIdenticalPairs++;
            }
        }

        System.out.println(numIdenticalPairs);
    }
}
