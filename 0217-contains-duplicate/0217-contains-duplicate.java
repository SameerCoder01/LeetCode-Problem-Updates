class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        boolean ans = false;
        for(int i=0; i<nums.length; i++){
            int num = map.get(nums[i]);
            if(num >= 2){
                ans = true;
                break;
            }
        }
        return ans;
    }
}