class Solution {
    public long maximumTripletValue(int[] nums) {

        long value = -1;

        int n = nums.length;

        for(int i=0; i<n-2; i++){

            for(int j=i+1; j<n-1; j++){

                for(int k=j+1; k<n; k++){
                    long v = (long)(nums[i] - nums[j]) * nums[k];
                    if(v > value){
                        value = v;
                    }
                }
            }
        }

        if(value < 0) return 0;

        return value;
    }
}