class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;

        int sum = 0;

        int res = Integer.MAX_VALUE;
        boolean check = false;

        while(high < nums.length){
            // Sabse pehle koi hiring hui nhi hai to hiring krwayenge
            sum = sum + nums[high]; // hiring will happen only by using high pointer
            
            // Ab jab ekbaar hiring ho gii hai to dekhenge ki kya ye hired value >= target ko satisfy kr rha hai ya nhi
            while(sum >= target){
                check = true;
                int len = high-low+1;
                res = Math.min(len,res);

                sum = sum-nums[low];
                low++;
            }

            high++; //
        }
        if(check){
            return res;
        }else{
            return 0;
        }
    }
}