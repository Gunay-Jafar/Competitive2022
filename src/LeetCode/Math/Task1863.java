package LeetCode.Math;

public class Task1863 {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 1, 6};
        int sumXor = nums[0] + nums[nums.length - 1];
        int hasil = nums[nums.length - 1];


        for (int i = 0; i < nums.length - 1; i++) {
            hasil = hasil ^ nums[i];
            for (int j = 1; j < nums.length; j++) {
                if (i == j) {
                    sumXor += nums[i];
                } else {
                    sumXor += nums[i] ^ nums[j];
                }
            }
        }

      //      return sumXor + hasil;
    }
}
