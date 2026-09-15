class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);
        }

        for(int i=0; i<nums.length; i++){
            int diff = target-nums[i];
            if(map.containsKey(diff) && map.get(diff) != i){
                arr[0] = i;
                arr[1] = map.get(diff);
            }
        }

        return arr;
        // Arrays.sort(nums);
        // int[] arr = new int[2];

        // int i=0; int j = nums.length-1;
        // while(i < j){
        //     int sum = nums[i] + nums[j];
        //     if(sum > target){
        //         j--;
        //     }else if(sum < target){
        //         i++;
        //     }else{
        //         arr[0] = nums[i];
        //         arr[1] = nums[j];
        //         break;
        //     }
        // }

        // arr[0] = map.get(arr[0]);
        // arr[1] = map.get(arr[1]);
        // return arr;

        // int[] arr = new int[2];
        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i] + nums[j] == target){
        //             arr[0] = i;
        //             arr[1] = j;
        //             break;
        //         }
        //     }
        // }
        // return arr;
    }
}