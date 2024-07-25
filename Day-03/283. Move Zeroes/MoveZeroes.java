public class MoveZeroes {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        //approach1 : can use bubble sort algo ig..: O(n2)
        //approach2 : O(n) : 
        int count = 0; // stores index of nonzero ele
        for(int i=0;i<n; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }
}
