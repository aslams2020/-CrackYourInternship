import java.util.*;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        // key : ele & value : index
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (mp.containsKey(diff)) {
                return new int[] { mp.get(diff), i };
            } else {
                mp.put(nums[i], i);
            }
        }
        return new int[] { -1 };
    }
}