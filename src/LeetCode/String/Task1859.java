package LeetCode.String;

import java.util.Scanner;

public class Task1859 {
    public static void main(String[] args) {
        String str = "Myself2 Me1 I4 and3";
        String[] newStr = str.split("\\s+");
        for (int i = 0; i < newStr.length; i++) {
            System.out.println(newStr[i]);
        }
    }
}
