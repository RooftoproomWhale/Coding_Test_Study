import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals("6210",new Solution().solution(new int[]{6, 10, 2}));
        assertEquals("9534330",new Solution().solution(new int[]{3, 30, 34, 5, 9}));
        assertEquals("0",new Solution().solution(new int[]{0, 0, 0}));
    }
}