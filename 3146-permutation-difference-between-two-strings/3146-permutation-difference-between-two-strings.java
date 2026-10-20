class Solution {
    public int findPermutationDifference(String s, String t) {
        // HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        // for(int i=0; i<s.length(); i++){
        //     map1.put(s.charAt(i),i);
        // }

        for(int i=0; i<s.length(); i++){
            map2.put(t.charAt(i),i);
        }

        int ans = 0;
        for(int i=0; i<s.length(); i++){
            int no = map2.get(s.charAt(i));
            ans += Math.abs(i-no);
        }

        return ans;


    }
}