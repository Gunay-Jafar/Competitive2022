package LeetCode.Arrays;
//https://leetcode.com/problems/richest-customer-wealth/submissions/

public class Task1672 {
    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if (sum > maximumWealth) {
                maximumWealth = sum;
            } else {
                sum = 0;
            }
        }

        return maximumWealth;
    }
}
