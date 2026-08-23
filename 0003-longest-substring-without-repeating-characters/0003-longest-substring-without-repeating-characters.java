class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0){
            return 0;
        }
        int n = s.length();
        int low = 0;
        int high = 0;

        int res =  Integer.MIN_VALUE;

        HashMap<Character,Integer> map = new HashMap<>();

        for(high=0; high < n; high++){
            char ch = s.charAt(high);
            int cc = map.getOrDefault(ch,0);
            map.put(ch,cc+1);

            int k = high-low+1;

            while(map.size() < k){
                char c = s.charAt(low);
                map.put(c,map.get(c)-1);
                if(map.get(c) == 0){
                    map.remove(c);
                }
                low++;
                k = high-low+1;
            }

            int len = high-low+1;
            res = Math.max(res,len);

        }
        return res;
    }
}