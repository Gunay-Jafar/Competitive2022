package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Task1431 {
    public static void main(String[] args) {
        List<Boolean> kidsWithCandies = new ArrayList<>();
        int[] candies = new int[]{2, 3, 5, 1, 3};
        int sum = 0;
        for (int candy : candies) {
            sum = candy + candies[candies.length - 1];
        }

        for (int candy : candies) {
            if (sum > candy) {
                kidsWithCandies.add(true);
            } else {
                kidsWithCandies.add(false);
            }
        }
        System.out.println(kidsWithCandies);
    }
}
