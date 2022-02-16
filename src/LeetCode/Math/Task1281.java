package LeetCode.Math;

public class Task1281 {
    public static void main(String[] args) {
        int n = 234;

        int sum = 0;
        int product = 1;

        while (n > 0) {
            int num = n % 10;
            sum += num;
            product *= num;
            n = n / 10;
        }

      //  return product - sum;
    }
}
