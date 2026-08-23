class Solution {

    public int maxfreq(int[] arr){
        int maxc = -1;
        for(int i=0; i<26; i++){
            maxc = Math.max(maxc,arr[i]);
        }

        return maxc;
    }
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int low=0; int high = 0;
        int res = Integer.MIN_VALUE;

        int[] freq = new int[26];

        for(high = 0; high<n; high++){
            freq[s.charAt(high)-'A']++;

            int len = high-low+1;
            int maxc = maxfreq(freq);
            int diff = len-maxc;

            while(diff > k){
                freq[s.charAt(low) - 'A']--;
                low++;

                len = high-low+1;
                maxc = maxfreq(freq);
                diff = len-maxc;
            }

            int l = high-low+1;
            res = Math.max(l,res);
        }
        return res;
    }
}