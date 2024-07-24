public class KthLargestEle {
    public int findKthLargest(int[] nums, int k) {
        //minheap
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int n = nums.length;
        // add ele into minheap 
        for(int i=0; i<n;i++)  {
            q.add(nums[i]);
            if(q.size()>k) 
                q.poll();
        }
        //remaining is the ans
        return q.peek();
    }
}
