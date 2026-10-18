class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        
        for(int i=0; i<word1.length(); i++){
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);

            map1.put(ch1,map1.getOrDefault(ch1,0)+1);
            map2.put(ch2,map2.getOrDefault(ch2,0)+1);
        }

        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for(char ch : map1.keySet()){
            int num = map1.get(ch);
            l1.add(num);
        }

        for(char ch : map2.keySet()){
            int num = map2.get(ch);
            l2.add(num);
        }

        Collections.sort(l1);
        Collections.sort(l2);
        
        for(int i=0; i<l1.size(); i++){
            if(!l1.get(i).equals(l2.get(i))){
                return false;
            }
        }
        

        if(map1.size() != map2.size()){
            return false;
        }else{
            return true;
        }


    }
}