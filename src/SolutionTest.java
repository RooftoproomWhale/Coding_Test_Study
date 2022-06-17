import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution() {
        String input =
                "ABC\n" +
                "BD.\n" +
                "CEF\n" +
                "E..\n" +
                "F.G\n" +
                "D..\n" +
                "G..";

        new Solution().solution(input);
    }
}