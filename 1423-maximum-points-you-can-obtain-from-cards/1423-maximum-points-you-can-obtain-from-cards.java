class Solution {
    public int maxScore(int[] nums, int k) {
        int n = nums.length;

        int i=0;
        int j = n-k-1;

        int sum = 0;
        for(int x=i; x<=j; x++){
            sum += nums[x];
        }

        int min = Integer.MAX_VALUE;
        min = Math.min(sum,min);

        while(j < n){

            min = Math.min(sum,min);
            if(j == n-1) break;
            int newsum = sum - nums[i] + nums[j+1];

            sum = newsum;
            i++;
            j++;
        }

        int ts = 0;
        for(int id=0; id<n; id++){
            ts += nums[id];
        }

        return ts-min;
    }
}