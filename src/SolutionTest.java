import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void solution() {
        assertEquals(576,new Solution().solution("02984"));
        assertEquals(210,new Solution().solution("567"));
        assertEquals(8,new Solution().solution("20202"));
    }
}