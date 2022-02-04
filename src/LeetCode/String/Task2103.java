package LeetCode.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//https://leetcode.com/problems/rings-and-rods/submissions/
public class Task2103 {
    public static void main(String[] args) {
        String rings = "B0B6G0R6R0R6G9";
        char[] array = rings.toCharArray();

        Map<Character, HashSet<Character>> map = new HashMap<>();
        for (int i = 1; i < rings.length(); i += 2) {
            if (map.containsKey(array[i])) {
                map.get(array[i]).add(array[i - 1]);
            } else {
                HashSet<Character> set = new HashSet<>();
                set.add(array[i - 1]);
                map.put(array[i], set);
            }
        }
        int count = 0;

        for (Map.Entry<Character, HashSet<Character>> e : map.entrySet()) {
            if (e.getValue().size() == 3) {
                count++;
            }
        }
    }
}
