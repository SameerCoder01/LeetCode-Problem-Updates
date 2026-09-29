class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0;
        int j = k-1;

        int sum = 0;
        for(int x=i; x<=j; x++){
            sum += arr[x];
        }

        double avg = (double)sum/k;
        int count = 0;

        if(avg >= threshold){
            count++;
        }

        while(j < arr.length){
            
            if(j == arr.length-1) break;
            int newsum = sum - arr[i] + arr[j+1];
            i++;
            j++;

            sum = newsum;

            double newavg = (double)sum/k;
            if(newavg >= threshold){
                count++;
            }
            
        }
        return count;
    }
}