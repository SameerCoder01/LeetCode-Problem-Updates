class Solution {
    // public boolean sumdigit(int n){
    public boolean isHappy(int n) {
        if(n == 1) return true;

        HashSet<Integer> set = new HashSet<>();
        int os = n;
        while(os != 1){
            int num = os;
            int sum = 0;
            while(num > 0){
                int d = num%10;
                sum += (d*d);
                num/=10;
            }
            if(set.contains(sum)){
                return false;
            }else{
                set.add(sum);
                os = sum;
            }
            
        }
        return true;

    //     if(sum == 1) return true;
    //     int num = n;
    //     int sum = 0;
    //     while(num > 0){
    //         int d = num%10;
    //         sum += (d*d);
    //         num/=10;
    //     }

    //     sumdigit(sum);
        
    // }
    // public boolean isHappy(int n) {
    //     if(n == 1) return true;

    //     // boolean ans = sumdigit(n);
    //     for
    //     return ans;
    }
}