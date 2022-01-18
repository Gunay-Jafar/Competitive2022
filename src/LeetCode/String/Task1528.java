package LeetCode.String;

//https://leetcode.com/problems/shuffle-string/submissions/
public class Task1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = new int[]{4, 5, 6, 7, 0, 2, 1, 3};
        char[] arr = new char[s.length()]; // c,o,d,e,l,e,e,t
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = s.charAt(i);
        }

        System.out.println(String.valueOf(arr));
        //  return String.valueOf(arr);
    }
}
