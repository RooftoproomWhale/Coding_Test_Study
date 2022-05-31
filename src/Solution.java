import java.util.ArrayDeque;

/**
 * 문제 설명
 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
 * 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
 **/
public class Solution {
    public double solution(String postfixNotation) {
        ArrayDeque<Double> stack = new ArrayDeque<>();
        for (int i = 0; i < postfixNotation.length(); i++) {
            char codePoint = postfixNotation.charAt(i);
            if (Character.isDigit(codePoint)) {
                stack.push((double) Character.digit(codePoint, 10));
                continue;
            }

            if (stack.size() < 2) {
                throw new IllegalArgumentException("올바르지 않은 연산식.");
            }

            double operand1 = stack.pop();
            double operand2 = stack.pop();
            stack.push(Operator.calculate(codePoint, operand2, operand1));
        }
        return stack.pop();
    }
}