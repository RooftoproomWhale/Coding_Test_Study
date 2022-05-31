import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    @DisplayName("다리를 지나는 트럭 테스트")
    void truckCrossingBridge() {
        final Solution solution = new Solution();
        assertEquals(solution.solution(2, 10, new int[]{7, 4, 5, 6}), 8);
    }

    @Test
    @DisplayName("다리를 지나는 트럭 테스트2")
    void truckCrossingBridge2() {
        final Solution solution = new Solution();
        assertEquals(solution.solution(100, 100, new int[]{10}), 101);
    }

    @Test
    @DisplayName("다리를 지나는 트럭 테스트3")
    void truckCrossingBridge3() {
        final Solution solution = new Solution();
        assertEquals(solution.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}), 110);
    }


    @Test
    @DisplayName("다리를 지나는 트럭 테스트4")
    void truckCrossingBridge4() {
        final Solution solution = new Solution();
        assertEquals(solution.solution(3, 10, new int[]{2,3,5,2,3}), 8);
    }

    @Test
    @DisplayName("다리를 지나는 트럭 테스트5")
    void truckCrossingBridge5() {
        final Solution solution = new Solution();
        assertEquals(solution.solution(4, 10, new int[]{2,3,5,2,3}), 10);
    }

    @Test
    @DisplayName("다리를 지나는 트럭 테스트6")
    void truckCrossingBridge6() {
        final Solution solution = new Solution();
        assertEquals(solution.solution(1, 1, new int[]{1,1,1,1}), 5);
    }

}