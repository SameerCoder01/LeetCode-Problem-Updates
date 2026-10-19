class Solution {
    public int atmost(int[] nums, int k){
        if(k == 0) return 0;

        int n = nums.length;
        int low = 0;
        int high = 0;
        int res = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        while(high < n){
            int num = nums[high];
            int cc = map.getOrDefault(num,0);
            map.put(num,cc+1);

            while(map.size() > k){
                int no = nums[low];
                int ccc = map.get(no);
                
                if(ccc == 1){
                    map.remove(no);
                }else{
                    map.put(no,ccc-1);
                }
                low++;
            }

            if(map.size() <= k){
                res += high-low+1;
            }
            high++;
        }
        return res;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {

        return atmost(nums,k) - atmost(nums,k-1);
        // int low = 0;
        // int high = 0;
        // int n = nums.length;

        // int res = 0;

        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(high = 0; high<n; high++){
        //     int num = nums[high];
        //     int cc = map.getOrDefault(num,0);
        //     map.put(num,cc+1);

        //     while(map.size() > k){
        //         int no = nums[low];
        //         map.put(no,map.get(no)-1);

        //         if(map.get(no) == 0){
        //             map.remove(no);
        //         }
        //         low++;
        //     }

        //     if(map.size() == k){
        //         res += high-low+1;
        //     }
        // }

        // return res;
    }
}