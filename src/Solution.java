import java.util.Stack;

public class Solution {
    public boolean solution(String s) {
        Stack<String> chkStack = new Stack<>();

        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                chkStack.push(s);
            }
            else if (chkStack.empty()) {
                return false;
            }
            else {
                chkStack.pop();
            }
        }

        if (chkStack.empty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
