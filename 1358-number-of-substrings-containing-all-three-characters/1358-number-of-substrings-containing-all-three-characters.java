class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int low = 0;
        int high = 0;

        HashMap<Character,Integer> map = new HashMap<>();
        int ans = 0;

        for(high = 0; high < n; high++){
            char ch = s.charAt(high);
            int cc = map.getOrDefault(ch,0);
            map.put(ch,cc+1);

            // map.put(ch, map.getOrDefault(ch, 0) + 1);
            while(map.size() == 3){
                ans += n-high;

                char c = s.charAt(low);
                int ccc = map.get(c);
                map.put(c,ccc-1);

                if(map.get(c) == 0){
                    map.remove(c);
                }
                low++;

            }

        }
        return ans;
    }
}