class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();

        boolean ans = true;

        for(int i=0; i<s.length(); i++){

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(map1.containsKey(ch1)){
                if(map1.get(ch1) != ch2){
                    ans = false;
                    break;
                }
            }

            if(map2.containsKey(ch2)){
                if(map2.get(ch2) != ch1){
                    ans = false;
                    break;
                }
            }

            map1.put(ch1,ch2);
            map2.put(ch2,ch1);
            
        }
        return ans;
    }

        
    




        // HashMap<Character,Integer> map1 = new HashMap<>();
        // HashMap<Character,Integer> map2 = new HashMap<>();

        // for(int i=0; i<s.length(); i++){

        //     char ch1 = s.charAt(i);
        //     char ch2 = t.charAt(i);
        //     map1.put(ch1,map1.getOrDefault(ch1,0)+1);
        //     map2.put(ch2,map2.getOrDefault(ch2,0)+1);
        // }

        // boolean ans = true;
        // for(int i=0; i<s.length(); i++){
        //     char ch1 = s.charAt(i);
        //     char ch2 = t.charAt(i);

        //     if(map1.get(ch1) != map2.get(ch2)){
        //         ans = false;
        //         break;
        //     }
        // }

        // return ans;
    
}