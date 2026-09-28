class Solution {
    public int findDuplicate(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int key : map.keySet()){
            int num = map.get(key);
            if(num > 1){
                return key;
            }
        }
        return -1;

    }
}