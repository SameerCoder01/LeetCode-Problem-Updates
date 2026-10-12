class Solution {
    public int reverseDegree(String s) {

        int sum = 0;
        for(int i=0; i<s.length(); i++){
            char ch1 = 'z';
            char ch2 = s.charAt(i);

            int prod = (ch1-ch2+1)*(i+1);
            sum += prod;


        }

        return sum;
    }
}