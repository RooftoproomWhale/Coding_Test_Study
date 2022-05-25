import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(0,new Solution().solution(4,new int[]{4,0,3,0}));
        assertEquals(7,new Solution().solution(10,new int[]{1,3,5,4,0,0,7,0,0,6}));
    }
}