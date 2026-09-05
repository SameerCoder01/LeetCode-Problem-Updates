class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                if(Character.isUpperCase(ch)){
                    sb.append(Character.toLowerCase(ch));
                }else{
                    sb.append(ch);
                }
            }
        }
        String res = sb.toString();
        int i = 0;
        int j = res.length()-1;
        boolean ans = true;
        while(i < j){
            if(res.charAt(i) != res.charAt(j)){
                ans = false;
                break;
            }
            i++;
            j--;
        }
        return ans;
    }
}