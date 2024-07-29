public class rotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        //transpose
        transpose(matrix, n);

        // reverse each row
        for(int i=0; i<n; i++) {
                int low = 0; int high = matrix.length-1;
                while(low < high) {
                   swap(low, high, i, matrix);
                    low++;
                    high--;
           }
        }
    } 

    	static void swap(int low, int high, int i, int arr[][])
	{
	    	int temp = arr[i][low];
			arr[i][low] = arr[i][high];
			arr[i][high] = temp;
	}

    static void transpose(int [][]matrix, int n) {
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
}

}