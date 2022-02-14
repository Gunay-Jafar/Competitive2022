package LeetCode.Arrays;

import java.util.HashMap;
import java.util.Map;

public class Task242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        Map<Character, Integer> maps = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (maps.containsKey(s.charAt(i))) {
                maps.put(s.charAt(i), maps.get(s.charAt(i)) + 1);
            } else {
                maps.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (!maps.containsKey(t.charAt(i))) {
                //  return false;
                System.out.println("false");
            } else {
                maps.put(t.charAt(i), maps.get(t.charAt(i)) - 1);
            }
        }

        for (Map.Entry<Character, Integer> test : maps.entrySet()) {
            if (test.getValue() != 0) {
               // return false;
            }
        }

     //   return true;

    }
}
