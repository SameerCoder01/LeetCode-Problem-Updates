class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int high = 0;

        int ans = Integer.MIN_VALUE;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(high=0; high<n; high++){
            int no = nums[high];
            map.put(no,map.getOrDefault(no,0)+1);

            // Kyunki har baar high par add kiya gaya element hi nayi frequency violation create kar sakta hai.
            while(map.get(nums[high]) > k){
                int cc = map.get(nums[low]);
                map.put(nums[low],cc-1);

                if(map.get(nums[low]) == 0){
                    map.remove(nums[low]);
                }
                low++;
            }

            // for(int ele: map.keySet()){
            //     if(map.get(ele) > k){
            //         int cc = map.get(nums[low]);
            //         map.put(nums[low],cc-1);
            //         if(map.get(nums[low]) == 0){
            //             map.remove(nums[low]);
            //         }
            //         low++;
            //     }
                
            // }

            int len = high-low+1;
            ans = Math.max(ans,len);
        }

        return ans;
    }
}