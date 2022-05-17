import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(2,new Solution().solution(5,new int[]{2,3,1,2,2}));
    }
}