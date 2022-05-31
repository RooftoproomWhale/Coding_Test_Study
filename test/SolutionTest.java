import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @ParameterizedTest(name = "[{displayName} {index}] expected : {arguments}")
    @CsvSource({
            "352+*5/,                               4.2",
            "352+*9-,                               12",
            "35+2*,                                 16",
            "573*+5-323*++,                         30",
            "58+65*+32+-73*-5-323*++,               21",
            "58+65*+32+-73*-5-323*++53+2+52*-+3+,   24"
    })
    @DisplayName("후위식 연산 테스트 케이스")
    void postfixNotationTest(String postfixNotation, double expected){
        assertEquals(new Solution().solution(postfixNotation), expected);
    }
}