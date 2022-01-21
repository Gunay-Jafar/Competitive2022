package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/submissions/
public class Task1431 {
    public static void main(String[] args) {
        List<Boolean> kidsWithCandies = new ArrayList<>();
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int extraCandies = 3;

        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max)
                max = candies[i];
        }

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max)
                kidsWithCandies.add(true);
            else
                kidsWithCandies.add(false);
        }
        System.out.println(kidsWithCandies);
    }
}
