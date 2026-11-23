class Solution {
    public boolean checkString(String s) {
        if(!s.contains("a") || !s.contains("b")){
            return true;
        }

        int i=0;
        for(i=0; i<s.length(); i++){
            if(s.charAt(i) == 'b'){
                break;
            }
        }

        int j = s.length()-1;

        while(j >= 0){
            if(s.charAt(j) == 'a'){
                break;
            }
            j--;
        }

        if(j < i){
            return true;
        }else{
            return false;
        }


    }
}