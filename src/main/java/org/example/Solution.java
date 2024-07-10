package org.example;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int height = matrix.length;
        int width = matrix[0].length;
        int top = 0;
        int bot = matrix.length - 1;
        int row = height + 1;

        while(top <= bot) {
            int mid = top + (bot - top)/2;
            if (matrix[mid][0] <= target && matrix[mid][width - 1] >= target) {
                row = mid;
                break;
            } else if (target > matrix[mid][width - 1]) {
                top = mid + 1;
            } else {
                bot = mid - 1;
            }
        }
        if (row == height + 1) {
            return false;
        }

        int left = 0;
        int right = width - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
