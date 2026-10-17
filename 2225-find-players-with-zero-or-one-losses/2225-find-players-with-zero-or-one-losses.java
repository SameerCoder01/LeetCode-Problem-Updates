class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int n = matches.length;


        HashMap<Integer,Integer> looser = new HashMap<>();
        for(int[] match : matches){
            
            int l = match[1];
            looser.put(l,looser.getOrDefault(l,0)+1);

            
        }

        // HashSet<Integer> winner = new HashSet<>();
        HashMap<Integer,Integer> winner = new HashMap<>();

        for(int[] match : matches){

            int w = match[0];

            if(!looser.containsKey(w)){
                winner.put(w,winner.getOrDefault(w,0)+1);
            }
        }

        List<Integer> l1 = new ArrayList<>();
        for(int ele : winner.keySet()){
            l1.add(ele);
        }
        Collections.sort(l1);


        List<Integer> l2 = new ArrayList<>();
        for(int ele : looser.keySet()){
            if(looser.get(ele) == 1){
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