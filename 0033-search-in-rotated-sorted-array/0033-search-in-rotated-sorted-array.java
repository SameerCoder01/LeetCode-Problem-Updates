class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        int mid = low + (high-low)/2;
        int ans = -1;

        while(low <= high){
            mid = low + (high-low)/2;

            if(target == nums[mid]){
                ans = mid;
                break;
            }

            // if left half is sorted
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target < nums[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                if(nums[mid] < target && target <= nums[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return ans;
    }
}