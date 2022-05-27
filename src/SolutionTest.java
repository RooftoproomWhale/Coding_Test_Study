import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sample1() {
        Solution T = new Solution();

        int K1 = 4;
        int[] nums1 = {3, 0, 4, 0};

        int K2 = 10;
        int[] nums2 = {1, 3, 5, 4, 0, 0, 7, 0, 0, 6};

        assertEquals(T.solution(K1, nums1), 0);
        assertEquals(T.solution(K2, nums2), 7);

        // 틀린 테스트
        assertEquals(T.solution(K2, nums2), 6);

    }

}