class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len = nums.length;

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }

        int[] arr = new int[len];
        int p = 0;
        int n = 0;
        for(int i=0; i<nums.length; i++){
            if(i%2 == 0){
                arr[i] = pos.get(p);
                p++;
            }else{
                arr[i] = neg.get(n);
                n++;
            }
        }
        return arr;

    }
}