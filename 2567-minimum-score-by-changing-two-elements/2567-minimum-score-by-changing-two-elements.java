class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length;
        if (n <= 3) return 0;

        Arrays.sort(nums);

        int c1 = nums[n-3] - nums[0]; 
        int c2 = nums[n-1] - nums[2]; 
        int c3 = nums[n-2] - nums[1];

        return Math.min(c1, Math.min(c2, c3));
    }
}