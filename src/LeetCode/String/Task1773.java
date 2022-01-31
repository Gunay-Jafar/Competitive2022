package LeetCode.String;

import java.util.List;

//https://leetcode.com/problems/count-items-matching-a-rule/submissions/
public class Task1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        if (items.size() == 0)
            return 0;

        int count = 0, index = 0;

        if (ruleKey.equals("type"))
            index = 0;
        else if (ruleKey.equals("color"))
            index = 1;
        else if (ruleKey.equals("name")) {
            index = 2;
        }

        for (int i = 0; i < items.size(); i++) {
            List<String> x = items.get(i);
            if(x.get(index).compareTo(ruleValue)==0){
                count++;
            }
        }
        return count;
    }
}
