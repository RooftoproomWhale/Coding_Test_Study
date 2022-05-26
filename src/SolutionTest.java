import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sample1() {
        Solution T = new Solution();

        assertTrue(T.solution("()()"));
        assertTrue(T.solution("(())()"));
        assertFalse(T.solution(")()("));
        assertFalse(T.solution("(()("));
    }

}