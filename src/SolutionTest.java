import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    @DisplayName("프린터 테스트")
    void printerTest(){
        final Solution solution = new Solution();
        assertEquals(solution.solution(new int[]{2, 1, 3, 2}, 2), 1);
        assertEquals(solution.solution(new int[]{1, 1, 9, 1, 1, 1}, 0), 5);

    }
}