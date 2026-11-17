class Solution {
    public int smallestNumber(int n, int t) {
        int num = n;
        
        
        while(num <= 100){
            int copy = num;

            int prod = 1;
            while(num != 0){
                int digit = num % 10;
                prod *= digit;
                num /= 10;
            }
            if(prod % t == 0){
                return copy;
            }else{
                num = copy+1;
            }
        }

        return n;
    }
}