class Solution {
    public void moveZeroes(int[] arr) {

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        // int n = nums.length;
        // if(n == 1) return;

        // int zero = 0;
        // int nonzero = 0;
        // for(int i=0; i<n; i++){
        //     if(nums[i] == 0){
        //         zero = i;
        //         break;
        //     }
        // }

        // for(int i=0; i<n; i++){
        //     if(nums[i] != 0){
        //         nonzero = i;
        //         break;
                
        //     }
        // }

        // for(int i=0; i<n; i++){
        //     if(nums[i] != 0 && i > zero){
        //         int temp = nums[i];
        //         nums[i] = nums[zero];
        //         nums[zero] = temp;
        //         zero++;
        //     }
            
        // }

   

                
// Solution : Brute Force and Extra space is used:

    //     int[] arr = new int[nums.length];
    //     int j = 0;
    //     for(int i=0; i<nums.length; i++){
    //         if(nums[i] != 0){
    //             arr[j] = nums[i];
    //             j++;
    //         }
    //     }

    //     for(int i=0; i<nums.length; i++){
    //         nums[i] = arr[i];
    //     }
    // }

    }
}