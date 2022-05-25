import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertTrue(new Solution().solution("()()"));
        assertTrue(new Solution().solution("(())()"));
        assertFalse(new Solution().solution(")()("));
        assertFalse(new Solution().solution("(()("));
        assertFalse(new Solution().solution("))"));
    }
}