package LeetCode.Arrays;


//https://leetcode.com/problems/decompress-run-length-encoded-list/submissions/
public class Task1313 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 6, 3};
        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        int[] arr = new int[sum];
        int index = 0;

        for (int i = 0; i < nums.length; i += 2) { //3,5,6,7
            for (int j = 0; j < nums[i]; j++) {
                arr[index] = nums[i + 1];
                index++;
            }
        }

        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
