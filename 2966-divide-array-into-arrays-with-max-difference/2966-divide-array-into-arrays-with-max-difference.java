class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
        Arrays.sort(nums);


        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<nums.length; i = i+3){
            list.add(new ArrayList<>(Arrays.asList(nums[i], nums[i+1], nums[i+2])));
        }

        for(List<Integer> ll : list){
            if(Math.abs(ll.get(0)-ll.get(2)) > k){
                return new int[0][0];
            }
        }

        int[][] arr = new int[list.size()][3];

        for(int i=0; i<list.size(); i++){
            for(int j=0; j<3; j++){
                arr[i][j] = list.get(i).get(j);
            }
        }

        return arr;
    }
}