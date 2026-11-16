class Solution {
    public int triangularSum(int[] nums) {
        
        while(nums.length > 1){
            
            int j = 0;
            int[] arr = new int[nums.length-1];

            for(int i = 0; i<nums.length-1; i++){
                int sum = (nums[i] + nums[i+1]) % 10;

                arr[j] = sum;
                j++;
            }

            nums = arr;
        }
        return nums[0];
    }
}