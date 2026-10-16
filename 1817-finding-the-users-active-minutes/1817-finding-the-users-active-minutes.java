class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {

        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();

        for(int[] log : logs){
            int userId = log[0];
            int min = log[1];

            map.putIfAbsent(userId, new HashSet<>());
            map.get(userId).add(min);
        }

        int[] arr = new int[k];

        for(HashSet<Integer> minutes : map.values()){
            int uam = minutes.size();
            arr[uam-1]++;
        }

        return arr;

        



        
    }
}