import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {
    PLUS('+', (a, b) -> a + b),
    MINUS('-', (a, b) -> a - b),
    MULTIPLE('*', (a, b) -> a * b),
    DIVIDE('/', (a, b) -> a / b);

    private final char operator;
    private final BiFunction<Double, Double, Double> expression;

    Operator(char operator, BiFunction<Double, Double, Double> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public static double calculate(char operator, double a, double b) {
        return getOperator(operator)
                .expression
                .apply(a, b);
    }

    private static Operator getOperator(char operator) {
        return Arrays.stream(Operator.values())
                .filter(o -> o.operator == operator)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 연산자."));
    }
}
