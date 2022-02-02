package LeetCode.String;

//https://leetcode.com/problems/sorting-the-sentence/
public class Task1859 {
    public static void main(String[] args) {
        String str = "Myself2 Me1 I4 and3";
        String[] strings = str.split("\\s+");
        String[] result = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            int index = Integer.valueOf(strings[i].substring(strings[i].length() - 1)) - 1;
            result[index] = strings[i].substring(0, strings[i].length() - 1);

        }
        System.out.println(String.join(" ",result));
    }
}
