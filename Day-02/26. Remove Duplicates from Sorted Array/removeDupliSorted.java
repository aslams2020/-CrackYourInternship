class removeDupliSorted {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length == 0) {
            return 0;
        }
    int uniquePtr = 0;

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[uniquePtr]) {
            uniquePtr++;
            nums[uniquePtr] = nums[i];
        }
    }

    return uniquePtr + 1;
        
        
    }
}