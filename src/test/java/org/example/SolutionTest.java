package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void searchMatrixTest() {
        Solution solution = new Solution();
        int[][] inputOne = new int[][] {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        assertTrue(solution.searchMatrix(inputOne, 3));
        int[][] inputTwo = new int[][] {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        assertFalse(solution.searchMatrix(inputTwo, 13));
    }

}