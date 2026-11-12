class Solution {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        int num = Math.abs(x);
        long ans = 0;

        while(num > 0){
            int d = num % 10;
            ans = ans*10 + d;
            num /= 10;
        }

        if(x < 0){
            ans *= -1;
        }

        if(ans > max || ans < min){
            return 0;
        }
        return (int)ans;
    }
}