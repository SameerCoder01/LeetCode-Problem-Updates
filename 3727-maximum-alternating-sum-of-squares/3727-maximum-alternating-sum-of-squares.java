class Solution {
    public long maxAlternatingSum(int[] nums) {

        int n = nums.length;
        for(int i=0; i<n; i++){
            nums[i] = Math.abs(nums[i]);
        }

        Arrays.sort(nums);

        int i=0; int j = n-1;
        long ans = 0;
        while(i < j){
            ans = ans + (nums[j] * nums[j]) - (nums[i] * nums[i]);
            i++;
            j--;
        }

        if(n % 2 != 0){
            ans += (nums[n/2] * nums[n/2]);
        }
        return ans;
    }
}