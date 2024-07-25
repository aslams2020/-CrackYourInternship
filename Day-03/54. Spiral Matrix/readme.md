# 45 Days Coding Challenge

## Day 3: 
## Spiral Order Matrix

### Problem Statement

Given an m x n matrix, return all elements of the matrix in spiral order.

### Example

**Example 1:**

**Input:** 
```plaintext
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]

**Output:**
[1, 2, 3, 6, 9, 8, 7, 4, 5]

```

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        
        int startRow = 0, endRow = matrix.length - 1;
        int startCol = 0, endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Traverse the top row from left to right
            for (int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            }

            // Traverse the right column from top to bottom
            for (int i = startRow + 1; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }

            // Traverse the bottom row from right to left
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                result.add(matrix[endRow][j]);
            }

            // Traverse the left column from bottom to top
            for (int i = endRow - 1; i > startRow; i--) {
                if (startCol == endCol) {
                    break;
                }
                result.add(matrix[i][startCol]);
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return result;
    }
}
```