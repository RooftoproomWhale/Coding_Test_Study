import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(3,
        new Solution().solution(new int[][]{{7,3,1,8},{3,3,3,4}}));
    }
}