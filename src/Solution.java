import java.util.Stack;

public class Solution {

    public int solution(int K, int[] nums) {
        Stack<Integer> chkStack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < K; i++) {
            if (nums[i] != 0) {
                chkStack.push(nums[i]);
            }
            else {
                chkStack.pop();
            }
        }

        for(Integer a : chkStack) {
            answer += a;
        }

        return answer;
    }
}
