class Solution {
    
    public int maxSubArray(int[] nums) {
        
        int count = 0;
        int maxneg = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0) count++;
            if(nums[i] > maxneg){
                maxneg = nums[i];
            }
        }

        if(count == nums.length){
            return maxneg;
        }

        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            currsum += nums[i];
            if(currsum < 0){
                currsum = 0;
            }else{
                if(currsum > maxsum){
                    maxsum = currsum;
                }
            }
        }
        return maxsum;


















// // Brute Force:
//         int n = nums.length;
//         int sum = Integer.MIN_VALUE;
//         for(int i=0; i<n; i++){
//             int curr_sum = 0;
//             for(int j=i; j<n; j++){
//                 curr_sum = curr_sum + nums[j];
//                 if(curr_sum > sum){
//                     sum = curr_sum;
//                 }
//             }
//         }
//         return sum;
    }
}