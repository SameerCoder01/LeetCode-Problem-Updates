class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i=0;
        int j=k-1;

        int sum = 0;
        for(int x=i; x<=j; x++){
            sum += nums[x];
        }
        double avg = (double)sum/k;
        while(j < nums.length-1){

            int newsum = sum-nums[i] + nums[j+1];
            i++;
            j++;
            sum = newsum;
            double newavg = (double)sum/k;
            if(newavg > avg){
                avg = newavg;
            }
        }

        return avg;
    }
}