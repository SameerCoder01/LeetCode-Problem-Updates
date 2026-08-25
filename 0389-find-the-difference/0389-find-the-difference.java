class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length() == 0){
            return t.charAt(0);
        }

        char ch = s.charAt(0);
        for(int i=1; i<s.length(); i++){
            ch = (char)(ch ^ s.charAt(i) ^ t.charAt(i));
        }
        ch = (char)(ch ^ t.charAt(t.length()-1) ^ t.charAt(0));

        return ch;
    }
}