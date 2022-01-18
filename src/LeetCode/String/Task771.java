package LeetCode.String;

//https://leetcode.com/problems/jewels-and-stones/submissions/
public class Task771 {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                result++;
            }
        }
        return result;
    }
}
