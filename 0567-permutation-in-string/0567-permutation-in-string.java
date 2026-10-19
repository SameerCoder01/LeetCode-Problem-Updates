class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int k = s1.length();
        int low = 0;
        int high = k-1;

        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int x = low; x<=high; x++){
            char ch = s2.charAt(x);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        boolean ans = false;

        while(high < s2.length()){
            if(map.equals(map2)){ // do not compare only keyset, compare keyset and values both, example : aab, abb
                ans = true;
                break;
            }

            if(high == s2.length()-1) break;
            high++;
            char ch = s2.charAt(high);
            int ccc = map2.getOrDefault(ch,0);
            map2.put(ch,ccc+1);

            char ch2 = s2.charAt(low);
            int cc = map2.get(ch2);

            if(cc == 1){
                map2.remove(ch2);
            }else{
                map2.put(ch2,cc-1);
            }
            low++;

        }

        return ans;


        // char[] arr1 = s1.toCharArray();
        // char[] arr2 = s2.toCharArray();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // String s11 = new String(arr1);
        // String s22 = new String(arr2);

        // if(s22.contains(s11)){
        //     return true;
        // }else{
        //     return false;
        // }
                
    }

    }
