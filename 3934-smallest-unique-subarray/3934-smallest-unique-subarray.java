class Solution {
    static long base = 100007;
    static long mod = 1000000007;

    public boolean isPossible(int[] nums, int len){
        int n = nums.length;
        HashMap<Long,Integer> map = new HashMap<>();

        long hash = 0;
        long power = 1;

        // First window ka calculate kar rhe hain hash sabse pehle
        for(int i=0; i<len; i++){
            hash = (hash*base + nums[i]) % mod;

            // calculating base ka power : so that next subarray ka hash banate time (of size len) hame ye bata chal sake ki kitna minus krna hai

            // base^(k-1)
            if(i < len-1){
                power = (power*base) % mod;
            }

        }

        map.put(hash,1);

        // Now calculating has for next subarrays
        for(int i=len; i<n; i++){
            // first remove the leftmost element of the previous window from hash:
            hash = (hash-power*nums[i-len] % mod + mod) % mod;

            // Ab leftmost remov krdiya hash se to ab new window ka rightmost add kar denge:

            hash = (hash*base+nums[i]) % mod;

            map.put(hash,map.getOrDefault(hash,0)+1);
        }

        // Ab hamne len subaaray ke saare lengths ka hash bana kar hashmap mein daal diya hai. Ab hame chrck krna hai ki kya koi bhi ek aisa hash hai jiski freq 1 hai. Agr hai to true return kar do

        for(int val : map.values()){
            if(val == 1){
                return true;
            }
        }

        return false;

    }
    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;

        int ans = n;
        
        int left = 1;
        int right = n;

        while(left <= right){
            int mid = left + (right-left)/2;

            if(isPossible(nums,mid)){
                ans = mid;
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return ans;

    }
}