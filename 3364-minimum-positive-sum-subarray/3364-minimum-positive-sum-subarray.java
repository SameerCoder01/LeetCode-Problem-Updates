
class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int n = nums.size();

        long[] prefix = new long[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums.get(i);
        }

        TreeMap<Long, Integer> map = new TreeMap<>();

        long ans = Long.MAX_VALUE;

        for (int i = l; i <= n; i++) {

            // Add valid starting index
            long add = prefix[i - l];
            map.put(add, map.getOrDefault(add, 0) + 1);

            // Remove starting index outside the window
            int removeIndex = i - r - 1;

            if (removeIndex >= 0) {
                long remove = prefix[removeIndex];

                if (map.get(remove) == 1) {
                    map.remove(remove);
                } else {
                    map.put(remove, map.get(remove) - 1);
                }
            }

            // Find greatest prefix sum strictly smaller than prefix[i]
            Long closest = map.lowerKey(prefix[i]);

            if (closest != null) {
                long sum = prefix[i] - closest;
                ans = Math.min(ans, sum);
            }
        }

        return ans == Long.MAX_VALUE ? -1 : (int) ans;
    }
}
