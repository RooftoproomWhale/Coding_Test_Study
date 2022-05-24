
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void solution()
    {
        assertEquals("BAPC\nThIsIsS3Cr3t", new Solution().solution("<<BP<A>>Cd-\nThIsIsS3Cr3t"));
        assertEquals("FTOPOO", new Solution().solution("ROO<<-FTOP"));
    }
}