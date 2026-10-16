class Solution {
    public int ATMOST(int[] nums, int k){
        if(k < 0) return 0;
        
        int n = nums.length;
        int low = 0;
        int high = 0;
        int count = 0;

        int nice = 0;

        for(high = 0; high < n; high++){
            int no = nums[high];
            
            if(no % 2 != 0){
                count++;
            }

            while(count > k){
                if(nums[low] % 2 != 0){
                    count--;
                }
                low++;
            }

            if(count <= k){
                nice += high-low+1;
            }

        }

        return nice;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int ans = ATMOST(nums,k) - ATMOST(nums,k-1);

        

        return ans;
    }
}