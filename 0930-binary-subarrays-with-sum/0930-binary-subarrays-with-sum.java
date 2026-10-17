class Solution {
    public int atmost(int[] nums, int k){
        if(k < 0) return 0;

        int n = nums.length;
        int low = 0;
        int high = 0;
        
        int sum = 0;
        int count = 0;
        for(high = 0; high<n; high++){
            sum += nums[high];

            while(sum > k){
                int no = nums[low];
                sum -= no;
                low++;
            }

            if(sum <= k){
                int len = high-low+1;
                count += len;
            }
        }

        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans = atmost(nums,goal) - atmost(nums,goal-1);

        return ans;
    }
}