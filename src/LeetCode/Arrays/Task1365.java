package LeetCode.Arrays;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/submissions/
public class Task1365 {
    public static void main(String[] args) {
        int[] nums = new int[]{8, 1, 2, 2, 3};
        int[] smallerNumbersThanCurrent = new int[nums.length];

        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i && nums[j] < nums[i]) {
                    max++;
                }
                smallerNumbersThanCurrent[i] = max;
            }
            //     System.out.print(smallerNumbersThanCurrent[i]+ " ");
        }
    }
}
