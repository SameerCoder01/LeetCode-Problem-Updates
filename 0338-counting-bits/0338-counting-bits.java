class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];

        for(int i=0; i<=n; i++){
            int count = 0;
            int num = i;
            if(num==0){
                arr[i] = 0;
            }else{
                while(num > 0){
                    count++;
                    num = num&(num-1);
                }
                arr[i] = count;
            }
        }
        return arr;
    }
}