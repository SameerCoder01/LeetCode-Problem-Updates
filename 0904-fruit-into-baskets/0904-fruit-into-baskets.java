class Solution {
    public int totalFruit(int[] fruits) {

        int n = fruits.length;

        int low = 0;
        int high = 0;

        int res = Integer.MIN_VALUE;

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(high=0; high<n; high++){
            int num = fruits[high];
            int currentfreq = map.getOrDefault(num,0);
            map.put(num,currentfreq+1);

            while(map.size() > 2){
                int no = fruits[low];
                map.put(no,map.get(no)-1);
                if(map.get(no) == 0){
                    map.remove(no);
                }
                
                low++;
            }

            if(map.size() == 2 || map.size() < 2){
                int len = high-low+1;
                res = Math.max(res,len);
            }
        }

        return res;
    }
}