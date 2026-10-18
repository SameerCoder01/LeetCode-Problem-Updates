class Solution {
    public int numOfSubarrays(int[] nums) {
        // try 2:

        int n =  nums.length;
        int even = 1;
        int odd = 0;
        long prefixsum = 0;
        long ans = 0;
        long mod = (long)Math.pow(10,9)+7;

        for(int i=0; i<n; i++){
            prefixsum += nums[i];
            
            if(prefixsum % 2 == 0){
                ans = (ans + odd) % mod;
                even++;
            }else{
                ans = (ans + even) % mod;
                odd++;
            }
        }
        return (int)ans;
        // int n = nums.length;
        // int low = 0;
        // int high = 0;
        // long sum = 0;

        // int ans = 0;
        // for(high = 0; high<n; high++){
        //     sum += nums[high];

        //     while(sum % 2 == 0){
        //         int no = nums[low];
        //         if(no % 2 != 0){
        //             sum -= no;
        //             ans++;
        //         }else{
        //             sum -= no;
        //         }
                
        //         low++;
        //     }

        //     if(sum % 2 != 0){
        //         ans++;
        //     }
        // }
        // return ans;
    }
}