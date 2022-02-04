package LeetCode.Arrays;

public class Task1720 {
    public static void main(String[] args) {
        int[] encoded = new int[]{1, 2, 3};
        int first = 1;

        int[] result = new int[encoded.length + 1];
        result[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            result[i + 1] = first ^ encoded[i]; //0,2,
            first = result[i + 1]; //0,2
        }
    }
}
