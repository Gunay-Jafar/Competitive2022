package LeetCode.Math;

public class Task1486 {
    public static void main(String[] args) {
        int n = 5;
        int start = 0;

        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor ^= (start + 2 * i);
        }
        // return xor;
    }
}
