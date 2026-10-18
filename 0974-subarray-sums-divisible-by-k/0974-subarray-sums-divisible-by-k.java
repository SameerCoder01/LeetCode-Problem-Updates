class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;

        int[] prefixsum = new int[n];

        prefixsum[0] = nums[0];

        for(int i=1; i<n; i++){
            prefixsum[i] = prefixsum[i-1] + nums[i];
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        
        for(int i=0; i<n; i++){
            int rem = ((prefixsum[i] % k) + k) % k;
            map.put(rem,map.getOrDefault(rem,0)+1);        
        }

        int count = 0;
        for(int i=0; i<n; i++){
            int freq = ((prefixsum[i] % k ) + k) % k;
            if(map.containsKey(freq)){
                count += map.get(freq)-1;
                map.put(freq,map.get(freq)-1);
                if(map.get(freq) == 0){
                    map.remove(freq);
                }
            }
        }

        return count;

    }
}