class Solution {
    public int titleToNumber(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=n-1; i>=0; i--){
            sb.append(s.charAt(i));
        }

        int sum = 0;
        for(int i=0; i<sb.length(); i++){
            int no = sb.charAt(i) - 'A' + 1;
            sum = sum + (int)(Math.pow(26,i)*(no));
        }
        return sum;
    }
}