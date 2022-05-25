import java.util.Stack;

public class Solution
{
    public int solution(int K, int[] money) {
        int sum = 0;

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < K; i++)
        {
            int m = money[i];
            if(m == 0 && stack.size() > 0)
            {
                stack.pop();
                continue;
            }
            stack.push(m);
        }

        for (Integer i : stack) {
            sum += i;
        }

        return sum;
    }
}
