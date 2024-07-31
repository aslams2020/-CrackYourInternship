public class topKfrequent {
    public int[] topKFrequent(int[] nums, int k) {
        // HashMap
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int ele : nums) {
            if (!mp.containsKey(ele))
                mp.put(ele, 1);
            else
                mp.put(ele, mp.get(ele) + 1);
        }

        // PriorityQueue
        PriorityQueue<Map.Entry<Integer, Integer>> minheap = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue());
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            minheap.add(entry);
            if (minheap.size() > k) {
                minheap.poll();
            }
        }
        int[] res = new int[k];
        int j = 0;
        while (minheap.size() > 0) {
            res[j++] = minheap.poll().getKey();
        }
        return res;
    }
}
