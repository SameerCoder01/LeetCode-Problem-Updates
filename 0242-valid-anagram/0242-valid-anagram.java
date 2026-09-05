class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        boolean ans = true;
        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch) && map.get(ch) != 0){
                int freq = map.get(ch);
                map.put(ch,freq-1);
            }else{
                ans = false;
                break;
            }
        }
        return ans;
    }
}