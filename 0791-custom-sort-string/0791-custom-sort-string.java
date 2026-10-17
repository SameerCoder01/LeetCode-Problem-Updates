class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        StringBuilder present = new StringBuilder();

        for(int i=0; i<order.length(); i++){
            char ch = order.charAt(i);
            if(s.contains(String.valueOf(ch))){
                present.append(ch);
            }
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<present.length(); i++){
            char ch = present.charAt(i);

            int no = map.get(ch);
            for(int j=0; j<no; j++){
                sb.append(ch);
            }

        }

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!order.contains(String.valueOf(ch))){
                sb.append(ch);
            }
        }

        return String.valueOf(sb);
    }
}