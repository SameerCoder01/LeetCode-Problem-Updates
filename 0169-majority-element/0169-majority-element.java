class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int ans = nums[0];
        for(int ele : map.keySet()){
            int freq = map.get(ele);
            if(freq > n/2){
                ans = ele;
                break;
            }
        }
        return ans;
    }
}