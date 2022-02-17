package LeetCode.Math;

public class Task9 {
    public static void main(String[] args) {
        int x = 121;

        int n = x;
        int r = 0;
        if (x < 0) {
            //return false;
        }

        while (x != 0) {
            int temp = x % 10;
            r = r * 10 + temp;
            x = x / 10;
        }

       // return (n == r);
    }
}
