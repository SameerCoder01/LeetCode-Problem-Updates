class Solution {
    public boolean isValid(String s) {

        if(s.length() == 1) return false;

        ArrayList<Character> list = new ArrayList<>();
        list.add(s.charAt(0));

        for(int i=1; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                if(list.size() == 0) return false;
                if(list.get(list.size()-1) == '('){
                    list.remove(list.size()-1);
                    continue;
                }else{
                    return false;
                }
            }

            if(ch == '}'){
                if(list.size() == 0) return false;
                if(list.get(list.size()-1) == '{'){
                    list.remove(list.size()-1);
                    continue; 
                }else{
                    return false;
                }
            }

            if(ch == ']'){
                if(list.size() == 0) return false;
                if(list.get(list.size()-1) == '['){
                    list.remove(list.size()-1);
                    continue;
                }else{
                    return false;
                }
            }

            list.add(ch); 
        }

        // if(list.size() == 0){
        //     return true;
        // }else{
        //     return false;
        // }
        return (list.size() == 0) ? true : false;

        
        // boolean ans = true;

        // for(int i=0; i<s.length()-1; i++){
        //     if(s.charAt(i) == '('){
        //         if(s.charAt(i+1) != ')'){
        //             ans = false;
        //             return ans;
        //         }
        //     }else if(s.charAt(i) == '{'){
        //         if(s.charAt(i+1) != '}'){
        //             ans = false;
        //             return ans;
        //         }
        //     }else if(s.charAt(i) == '['){
        //         if(s.charAt(i+1) != ']'){
        //             ans = false;
        //             return ans;
        //         }
        //     }
        // }
        // return ans;
    }
}