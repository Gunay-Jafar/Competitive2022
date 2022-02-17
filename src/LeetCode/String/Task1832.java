package LeetCode.String;

import java.util.HashSet;

public class Task1832 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        HashSet<Character> hashSet = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++) {
            hashSet.add(sentence.charAt(i));
        }

        if (hashSet.size() == 26) {
            //   return true;
        } else {
            //return false;
        }
    }
}
