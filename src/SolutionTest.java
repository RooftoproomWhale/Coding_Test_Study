import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("Queue 테스트")
    void queueTest() throws IOException {
        Solution solution = new Solution();
        String result = solution.solution().toString();
        String output = solution.getFile("output.tsv").toString();
        assertEquals(result, output);
    }
}