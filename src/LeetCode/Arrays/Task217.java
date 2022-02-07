package LeetCode.Arrays;

import java.util.HashSet;
import java.util.Set;

public class Task217 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
               // return true;
            } else {
                set.add(nums[i]);
            }
        }
        //return false;
    }
}
