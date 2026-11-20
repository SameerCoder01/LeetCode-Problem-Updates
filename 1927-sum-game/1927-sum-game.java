class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int half = n / 2;
        int sumDiff = 0; 
        int qDiff = 0;   

        for (int i = 0; i < n; i++) {
            char c = num.charAt(i);
            int sign = (i < half) ? 1 : -1;
            if (c == '?') {
                qDiff += sign;
            } else {
                sumDiff += sign * (c - '0');
            }
        }

        return 2 * sumDiff != -9 * qDiff;
    }
}