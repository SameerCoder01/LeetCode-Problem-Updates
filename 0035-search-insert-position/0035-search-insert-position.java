class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        int mid = low + (high-low)/2;

        int ans = -1;

        while(low <= high){
            mid = low + (high-low)/2;

            if(nums[mid] == target){
                ans = mid;
                break;
            }else if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }

        // return ans;
        if(ans != -1){
            return ans;
        }else{

            return low;
        }
    }
}
