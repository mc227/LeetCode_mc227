package LeetCode.Problem9;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void ten() {

        assertEquals(solution.isPalindrome(10),false);
    }

    @Test
    void Test1221() {
        assertEquals(solution.isPalindrome(1221),true);
    }

    @Test
    void Test121() {
        assertEquals(solution.isPalindrome(121),true);
    }

    @Test
    void Test101() {
        assertEquals(solution.isPalindrome(101),true);
    }
}