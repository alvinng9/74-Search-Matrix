package org.example;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //identify matrix's boundaries
        int top = 0;
        int bot = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int row = bot + 1;

        //find the row where the target is located by checking the minimum/maximum
        //value of each row
        while (top <= bot) {
            int mid = top + (bot - top) / 2;
            if (target >= matrix[mid][0] && target <= matrix[mid][right]) {
                row = mid;
                break;
            } else if (target > matrix[mid][right]) {
                top = mid + 1;
            } else {
                bot = mid - 1;
            }
        }

        //return false if the row is not identified
        if (row == matrix.length) {
            return false;
        }

        //check within the located row to see if the target can find a match
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        //return false if the target is not found
        return false;
    }
}
