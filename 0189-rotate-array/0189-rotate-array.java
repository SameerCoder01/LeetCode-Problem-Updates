class Solution {
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        if(n == 1) return;
        k = k % n;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<n-k; i++){
            map.put(i,i+k);
        }

        for(int i=n-k; i<n; i++){
            map.put(i,i-(n-k));
        }

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[map.get(i)] = nums[i];
        }
        
        for(int i=0; i<n; i++){
            nums[i] = arr[i];
        }
    }
}