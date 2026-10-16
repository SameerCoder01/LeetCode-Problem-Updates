class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);

        int start = 0;

        int count = 0;
        int grp = 1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] - nums[start] > k){
                grp++;
                start = i;
            }
        }

        return grp;
    }
}