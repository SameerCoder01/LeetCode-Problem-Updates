class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;
        int minsofar = Integer.MAX_VALUE;
        int max_profit = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(prices[i] < minsofar){
                minsofar = prices[i];
            }
            int profit = prices[i] - minsofar;
            if(profit > max_profit){
                max_profit = profit;
            }
        }

        return max_profit;



















        // int n = prices.length;
        // int ans = 0;
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(prices[j] - prices[i] > ans){
        //             ans = prices[j] - prices[i];
        //         }
        //     }
        // }
        // return ans;










        // int minidx = 0;
        // int minval = Integer.MAX_VALUE;
        // for(int i=0; i<prices.length; i++){
        //     if(prices[i] < minval){
        //         minval = prices[i];
        //         minidx = i;
        //     }
        // }
        
        // if(minidx == prices.length-1){
        //     return 0;
        // }

        // int maxidx = 0;
        // int maxval = Integer.MIN_VALUE;

        // for(int i=minidx; i<prices.length; i++){
        //     if(prices[i] > maxval){
        //         maxval = prices[i];
        //         maxidx = i;
        //     }
        // }
        // return maxval - minval;
    }
}