public class findDuplicate {
    public int findDuplicate(int[] nums) {

        HashSet<Integer> st = new HashSet<>();
        for (int num : nums) {
            if (st.contains(num)) {
                return num;
            }
            st.add(num);
        }
        return -1;
    }
}
