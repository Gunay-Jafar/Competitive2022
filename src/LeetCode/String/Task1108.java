package LeetCode.String;

//https://leetcode.com/problems/defanging-an-ip-address/submissions/
public class Task1108 {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);

            if (ch == '.') {
                sb.append("[.]");
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
