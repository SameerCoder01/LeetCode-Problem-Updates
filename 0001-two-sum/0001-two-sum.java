class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
        
        // Arrays.sort(nums);
        // int[] arr = new int[2];
        // int i=0;
        // int j = nums.length-1;

        // while(i < j){
        //     int sum = nums[i] + nums[j];
        //     if(sum > target){
        //         j--;
        //     }else if(sum < target){
        //         i++;
        //     }else{
        //         arr[0] = i;
        //         arr[1] = j;
        //         break;
        //     }
        // }
        // return arr;
    }
}