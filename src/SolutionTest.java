import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        assertEquals("1\n" +
                "2\n" +
                "2\n" +
                "0\n" +
                "1\n" +
                "2\n" +
                "-1\n" +
                "0\n" +
                "1\n" +
                "-1\n" +
                "0\n" +
                "3",
                new Solution().solution(15,"push 1\n" +
                "push 2\n" +
                "front\n" +
                "back\n" +
                "size\n" +
                "empty\n" +
                "pop\n" +
                "pop\n" +
                "pop\n" +
                "size\n" +
                "empty\n" +
                "pop\n" +
                "push 3\n" +
                "empty\n" +
                "front"));
    }
}