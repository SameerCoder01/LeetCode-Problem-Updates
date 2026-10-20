class Solution {
    public int scoreOfString(String s) {
        int ans = 0;

        for(int i=0; i<s.length()-1; i++){
            char ch1 = s.charAt(i);
            int ascii1 = ch1;

            char ch2 = s.charAt(i+1);
            int ascii2 = ch2;

            ans += Math.abs(ascii1-ascii2);
        }
        return ans;
    }
}