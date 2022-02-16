package LeetCode.Math;

public class Task1323 {
    public static void main(String[] args) {
        int num = 9669;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(num);

        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == '6') {
                stringBuilder.replace(i, i + 1, "9");
                System.out.println(Integer.parseInt(stringBuilder.toString()));

            }
        }


    }
}
