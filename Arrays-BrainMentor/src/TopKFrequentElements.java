public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        java.util.Map<Integer, Integer> countMap = new java.util.HashMap<>();
        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        java.util.PriorityQueue<Integer> heap = new java.util.PriorityQueue<>(
            (a, b) -> countMap.get(a) - countMap.get(b)
        );

        for (int num : countMap.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = heap.poll();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = topKFrequent(nums, k);
        System.out.print("Top " + k + " frequent elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
