class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int j = k-1;

        int vowel = 0;

        for(int x = i; x<=j; x++){
            char ch = s.charAt(x);
            if ("aeiou".indexOf(ch) != -1) {
                vowel++;
            }
        }

        int maxvowel = Integer.MIN_VALUE;
        while(j < s.length()){
            maxvowel = Math.max(vowel,maxvowel);

            if(j == s.length()-1) break;

            int newvowel = vowel;
            if("aeiou".indexOf(s.charAt(i)) != -1){
                newvowel -= 1;
            }

            if("aeiou".indexOf(s.charAt(j+1)) != -1){
                newvowel += 1;
            }

            vowel = newvowel;

            i++;
            j++;
        }
        return maxvowel;
    }
}