import java.util.*;
class spiralMartix {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>() ;
        if(matrix == null || matrix.length ==0) {
            return result;
        }
        int startRow = 0, endRow = matrix.length-1;
        int startCol = 0 , endCol = matrix[0].length -1;

        while((startRow <= endRow) && (startCol <= endCol)) {
            // top : startRow is const
            for(int j = startCol; j<= endCol; j++) {
                result.add(matrix[startRow][j]);
            }

            // right : endCol is const
            for(int i= startRow+1; i<= endRow; i++) {
                result.add(matrix[i][endCol]);
            }

            // bottom : endRow is const :
            for(int j= endCol-1; j>= startCol; j--) {
                if(startRow == endRow) {
                    break;
                }
                result.add(matrix[endRow][j]);
            }

            // left : startCol is const
            for(int i = endRow -1; i>= startRow+1; i--) {
                if(startCol == endCol) {
                    break;
                }
               result.add(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }
        System.out.println();
        
    return result;
}
}