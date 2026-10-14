class Solution {
    public int mySqrt(int x) {

        if(x == 0) return 0;
        
        long i = 1;
        long num = i;
        for(i=1; i*i<=x; i++){
            num = i;
        }

        return (int)num;

        // int low = 1;
        // int high = x;

        // int mid = low + (high-low)/2;
        // int ans = 0;

        // while(low <= high){
        //     mid = low + (high-low)/2;

        //     long square = (long)mid*mid;
        //     if(square == x){
        //         ans = mid;
        //         break;
        //     }else if(square > x){
        //         high = mid-1;
        //     }else{
        //         low = mid+1;
        //         ans = mid;
        //     }
        // }
        // return ans;
    }
}