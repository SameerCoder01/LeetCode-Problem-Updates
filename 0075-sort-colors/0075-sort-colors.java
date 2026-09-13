class Solution {
    public void sortColors(int[] nums) {

        int r = 0, w = 0, b = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                r++;
            }else if(nums[i] == 1){
                w++;
            }
            else{
                b++;
            }
        }

        int k = 0;

        while(r != 0 && k < nums.length){
            nums[k] = 0;
            k++;
            r--;
        }

        while(w != 0 && k < nums.length){
            nums[k] = 1;
            k++;
            w--;
        }

        while(b != 0 && k < nums.length){
            nums[k] = 2;
            k++;
            b--;
        }











        // int red = 0;
        // int white = 0;
        // int blue = 0;

        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] == 0){
        //         red++;
        //     }else if(nums[i] == 1){
        //         white++;
        //     }else{
        //         blue++;
        //     }
        // }

        // for(int i=0; i<red; i++){
        //     nums[i] = 0;
        // }

        // for(int i=red; i<red+white; i++){
        //     nums[i] = 1;
        // }
        
        // for(int i=red+white; i<red+white+blue; i++){
        //     nums[i] = 2;
        // }
        
        
    }
}