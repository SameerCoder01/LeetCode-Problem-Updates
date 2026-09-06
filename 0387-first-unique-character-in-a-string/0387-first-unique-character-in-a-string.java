class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int ans = -1;

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int num = map.get(ch);
            if(num >1){
                continue;
            }else{
                ans = i;
                break;
            }
        }
        return ans;
    }
}