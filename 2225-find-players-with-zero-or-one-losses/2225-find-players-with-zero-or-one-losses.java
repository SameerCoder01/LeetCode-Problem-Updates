class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int n = matches.length;

        HashSet<Integer> looser = new HashSet<>();


        HashMap<Integer,Integer> map = new HashMap<>();
        for(int[] match : matches){
            
            int l = match[1];
            map.put(l,map.getOrDefault(l,0)+1);

            looser.add(l);
        }

        // HashSet<Integer> winner = new HashSet<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();

        for(int[] match : matches){

            int w = match[0];

            if(!map.containsKey(w)){
                map2.put(w,map2.getOrDefault(w,0)+1);
            }
        }

        List<Integer> l1 = new ArrayList<>();
        for(int ele : map2.keySet()){
            l1.add(ele);
        }
        Collections.sort(l1);


        List<Integer> l2 = new ArrayList<>();
        for(int ele : map.keySet()){
            if(map.get(ele) == 1){
                l2.add(ele);
            }
        }
        Collections.sort(l2);

        List<List<Integer>> list = new ArrayList<>();

        list.add(l1);
        list.add(l2);

        return list;
    }
}