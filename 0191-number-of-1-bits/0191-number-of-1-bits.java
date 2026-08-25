class Solution {
    public int hammingWeight(int n) {

        //APPROACH 2 : Using normal division and remainder trick
        int num = n;

        int count = 0;
        while(num > 0){
            int bit = num % 2;
            if(bit == 1){
                count++;
            }
            num = num/2;
        }

        return count;
        
        // APPROACH 1 : Using bit manipulation
        // int count = 0;

        // int num = n;
        // while(num > 0){
        //     count++;
        //     num = num & (num-1);
        // }

        // return count;
    }
}