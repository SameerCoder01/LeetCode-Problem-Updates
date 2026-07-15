class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd = 0;
        int sumeven = 0;

        for(int i=1; i<=2*n; i++){
            if(i % 2 == 0){
                sumeven += i;
            }else{
                sumodd += i;
            }
        }

        int k = 1;
        for(k=Math.min(sumeven,sumodd); k>=1; k--){
            if(sumeven % k == 0 && sumodd % k == 0){
                return k;
            }
        }
        return k;
    }
}