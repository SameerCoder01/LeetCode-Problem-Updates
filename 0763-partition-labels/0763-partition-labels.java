class Solution {
    public List<Integer> partitionLabels(String s) {

        int n = s.length();
        HashMap<Character, Integer> last = new HashMap<>();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            last.put(ch,i);
        }

        int mL = 0;
        int start = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            mL = Math.max(mL, last.get(ch));

            if(i == mL){
                list.add(i-start+1);
                start = i+1;
            }
        }

        return list;




        // int n = s.length();

        // HashMap<Character, Integer> first = new HashMap<>();
        // HashMap<Character, Integer> last = new HashMap<>();

        // for(int i=0; i<s.length(); i++){
        //     char ch = s.charAt(i);
        //     if(first.containsKey(ch)){
        //         continue;
        //     }

        //     first.put(ch,i);
        // }

        // for(int j=s.length()-1; j>=0; j--){
        //     char ch = s.charAt(j);
        //     if(last.containsKey(ch)){
        //         continue;
        //     }

        //     last.put(ch,j);
        // }

        // ArrayList<String> list = new ArrayList<>();

        // int mL = last.get(s.charAt(0));
        
        // StringBuilder sb = new StringBuilder();
        // sb.append(s.charAt(0));
        // for(int i=1; i<n; i++){
        //     char ch = s.charAt(i);

        //     if(first.get(ch) <= mL){
        //         sb.append(ch);
        //     }else{
        //         list.add(String.valueOf(sb));
        //         sb.delete(0, sb.length());
        //         mL = first.get(ch);
        //         sb.append(ch);
        //     }
        // }
        // list.add(sb.toString());

        // ArrayList<Integer> l = new ArrayList<>();
        // for(int idx = 0; idx < list.size(); idx++){
        //     String ss = list.get(idx);
        //     l.add(ss.length());
        // }
        // return l;



    }
}