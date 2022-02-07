package LeetCode.Arrays;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int requiredNum = target - nums[i];
            if (indexMap.containsKey(requiredNum)) {
                int toReturn[] = {indexMap.get(requiredNum), i};
                // return toReturn;
            }
            indexMap.put(nums[i], i);
        }
        //  return null;
    }
}
