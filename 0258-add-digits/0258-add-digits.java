class Solution {
    public int addDigits(int num) {
        
        int no = num;

        while(String.valueOf(no).length() > 1){
            int sum = 0;
            while(no != 0){
                sum += no%10;
                no /= 10;
            }
            no = sum;
        }
        return no;
    }
}