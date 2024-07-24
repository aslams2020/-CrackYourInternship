import java.util.*;
public class findallDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int ele : nums){
            if(set.contains(ele)) {
                ans.add(ele);
            }
            else{
                set.add(ele);
            }
        }
        return ans;
    }
}
