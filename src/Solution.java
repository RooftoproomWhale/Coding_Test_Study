import java.util.Stack;

public class Solution
{
    public boolean solution(String s)
    {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == '(')
            {
                stack.push(c);
                continue;
            }

            if (stack.empty()) {return false;}

            stack.pop();
        }

        return stack.size() == 0;
    }
}
