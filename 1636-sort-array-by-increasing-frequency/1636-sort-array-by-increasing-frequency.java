class Solution {
    public int[] frequencySort(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int num : nums){
            list.add(num);
        }

        list.sort((a,b) -> {
            int fa = map.get(a);
            int fb = map.get(b);

            if(fa != fb){
                 // Descending order of frequency
                return Integer.compare(fa,fb);
            }else{
                return Integer.compare(b,a);
            }
        });

        for(int i=0; i<list.size(); i++){
            nums[i] = list.get(i);
        }

        return nums;

    }
}