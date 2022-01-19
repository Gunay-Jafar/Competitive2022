package LeetCode.String;

//https://leetcode.com/problems/goal-parser-interpretation/submissions/
public class Task1678 {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
