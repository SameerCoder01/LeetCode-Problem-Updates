class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;

        int[] nums = new int[n];
        int maxright = Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--){
            if(i == n-1){
                nums[i] = -1;
                maxright = arr[i];
            }else{
                maxright = Math.max(maxright,arr[i+1]);
                nums[i] = maxright;
            }
        }

        return nums;
    }
}