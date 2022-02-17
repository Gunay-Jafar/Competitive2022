package LeetCode.String;

public class Task1816 {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        String[] splited = s.split("\\s+");

        String ss = "";

        for (int i = 0; i < k; i++) {
            ss = ss + " " + splited[i];
        }
        System.out.println(ss.trim());

    }
}
