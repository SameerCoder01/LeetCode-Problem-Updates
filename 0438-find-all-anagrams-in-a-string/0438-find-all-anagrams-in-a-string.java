class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list = new ArrayList<>();
        if (p.length() > s.length()) return list;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<p.length(); i++){
            char ch = p.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        int k = p.length();
        int low = 0;
        int high = k-1;

        HashMap<Character,Integer> map2 = new HashMap<>();
        
        for(int x=low; x<=high; x++){
            char ch = s.charAt(x);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        for(int i = high; i<s.length(); i++){
            if(map.equals(map2)){
                list.add(low);
            }

            if(i == s.length()-1) break;
            

            char c = s.charAt(i+1);
            int ccc = map2.getOrDefault(c,0);
            map2.put(c,ccc+1);

            char ch = s.charAt(low);
            int cc = map2.get(ch);
            if(cc == 1){
                map2.remove(ch);
            }else{
                map2.put(ch,cc-1);
            }
            low++;
            
        }
        return list;
        
    }
}