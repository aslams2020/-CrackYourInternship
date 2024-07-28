# 73. Set Matrix Zeroes

## Problem Statement

Given an `m x n` integer matrix `matrix`, if an element is `0`, set its entire row and column to `0`'s.



### Example

**Example 1:**

**Input:** matrix = [[1,1,1],[1,0,1],[1,1,1]] 
**Output:** [[1,0,1],[0,0,0],[1,0,1]]

**Example 2:**

**Input:** matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
**Output:** [[0,0,0,0],[0,4,5,0],[0,3,1,0]]

### Constraints

- The number of nodes in the list is `n`.
- `1 <= m, n <= 200`
- `-231 <= matrix[i][j] <= 231 - 1`

## Solution
 

### Code

``` 
java :

public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {  // check where where there is a zero and mark true
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            if (zeroRows[i]) {   // if a row contain zero then all zero.
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }  }

        for (int j = 0; j < cols; j++) {
            if (zeroCols[j]) {  // if a column contain zero then all zero.
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

    ```