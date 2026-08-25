class Solution {
    public boolean isPowerOfTwo(int n) {
        int num = n;

        int count = 0;
        while(num > 0){
            count++;
            num = num & (num-1);
        }
        if(count == 1){
            return true;
        }else{
            return false;
        }

    }
}