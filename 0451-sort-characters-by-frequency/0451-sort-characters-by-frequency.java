class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        StringBuilder sb = new StringBuilder("");
        
        int size = map.size();
        for(int x=0; x<size; x++){
            char ch = ' ';
            int count = 0;

            for(char i : map.keySet()){
                int num = map.get(i);
                if(num > count){
                    count = num;
                    ch = i;
                }
            }

            for(int i=1; i<=count; i++){
                sb.append(ch);
            }
            map.remove(ch);
        }
        return sb.toString();

    }
}