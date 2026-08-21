class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // In case of variable size window low=0 and high=0 lena hoga vahi min poss. size of window hoga i.e, 1
        int low = 0;
        int high = 0;
        int result = Integer.MAX_VALUE;

        int sum = 0;

        while(high < nums.length){
            sum += nums[high];

            while(sum >= target){
                int len = high-low+1;
                result = Math.min(result,len);
                sum -= nums[low];
                low++;
            }
            high++;
        }
        if(result == Integer.MAX_VALUE){
            return 0;
        }else{
            return result;
        }

    }
}





















    //     int low = 0;
    //     int high = 0;

    //     int sum = 0;

    //     int res = Integer.MAX_VALUE;
    //     boolean check = false;

    //     while(high < nums.length){
    //         // Sabse pehle koi hiring hui nhi hai to hiring krwayenge
    //         sum = sum + nums[high]; // hiring will happen only by using high pointer
            
    //         // Ab jab ekbaar hiring ho gii hai to dekhenge ki kya ye hired value >= target ko satisfy kr rha hai ya nhi
    //         while(sum >= target){
    //             check = true;
    //             int len = high-low+1;
    //             res = Math.min(len,res);

    //             sum = sum-nums[low];
    //             low++;
    //         }

    //         high++; //
    //     }
    //     if(check){
    //         return res;
    //     }else{
    //         return 0;
    //     }
    // }
