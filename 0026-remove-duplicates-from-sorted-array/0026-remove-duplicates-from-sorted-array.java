class Solution {

    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;

        while(j < nums.length){
            if(nums[j] > nums[i]){
                swap(nums,j,i+1);
                i++;
            }
            j++;
        }

        return i+1;




















        // int n = nums.length;
        // int count = 1;
        // int i = 0;
        // int j = 1;
        // while(j < n){
        //     if(nums[j] != nums[i]){
        //         i++;
        //         nums[i] = nums[j];
        //         count++;
        //         j++;
        //     }else{
        //         j++;
        //     }
            
        // }

        // return count;
    }
}