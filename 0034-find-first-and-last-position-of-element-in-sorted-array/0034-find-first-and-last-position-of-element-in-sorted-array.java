class Solution {
    public int[] searchRange(int[] nums, int target) {

        

        int[] arr = {-1,-1};

        if(nums.length == 0){
            return arr;
        }

        // For finding first occurence index
        int start = 0;
        int end = nums.length - 1;

        int mid = start + (end-start)/2;

        while(start <= end){
            mid = start + (end-start)/2;

            if(target == nums[mid]){
                end = mid-1;
                arr[0] = mid;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        

        // For finding last occurence index
        int start2 = 0;
        int end2 = nums.length - 1;

        int mid2 = start2 + (end2-start2)/2;

        while(start2 <= end2){
            mid2 = start2 + (end2-start2)/2;

            if(target == nums[mid2]){
                start2 = mid2 + 1;
                arr[1] = mid2;
            }
            else if(target > nums[mid2]){
                start2 = mid2+1;
            }
            else{
                end2 = mid2 - 1;
            }
        }
        

        return arr;




        



// Two pointer method
        // int[] arr = {-1,-1};

        // int sindex = 0;
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] == target){
        //         sindex = i;
        //         arr[0] = i;
        //         break;
        //     }
        // }

        // int eindex = 0;
        // for(int i=nums.length-1; i>=0; i--){
        //     if(nums[i] == target){
        //         eindex = i; 
        //         arr[1] = i;
        //         break;                 
        //     }
        // }

        // return arr;

        

        
        
    }
}