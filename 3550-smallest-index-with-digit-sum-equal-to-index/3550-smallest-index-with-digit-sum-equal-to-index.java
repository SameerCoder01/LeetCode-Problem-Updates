class Solution {
    public int smallestIndex(int[] nums) {
        int ans = -1;
        for(int i=0; i<nums.length; i++)   {
            int no = nums[i];
            int sum = 0;
            while(no != 0){
                int d = no % 10;
                sum += d;
                no /= 10;
            }
            if(sum == i){
                ans = i;
                return ans;
            }
        }

        return ans;
    }
}