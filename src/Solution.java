public class Solution {
    boolean solution(String s) {
        final char[] brackets = s.toCharArray();
        int leftBacket = 0;
        for (char bracket : brackets) {
            if(bracket == '('){
                ++leftBacket;
            }else{
                --leftBacket;
                if(leftBacket < 0){
                    return false;
                }
            }
        }
        return leftBacket == 0;
    }

    public static void main(String[] args) {
        final Solution solution = new Solution();
        System.out.println("solution = " + solution.solution("(())()"));
    }
}
