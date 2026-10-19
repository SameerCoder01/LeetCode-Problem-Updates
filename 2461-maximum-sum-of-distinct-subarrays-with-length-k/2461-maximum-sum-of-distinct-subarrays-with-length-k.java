class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int high = k-1;

        HashMap<Integer,Integer> map = new HashMap<>();
        long sum = 0;

        for(int x=low; x<=high; x++){
            int no = nums[x];
            sum += no;
            int cc = map.getOrDefault(no,0);
            map.put(no,cc+1);
        }

        long ans = 0;

        while(high < n){

            if(map.size() == k){
                ans = Math.max(ans,sum);
            }

                int no = nums[low];
                sum -= no;
                int cc = map.get(no);
                if(cc == 1){
                    map.remove(no);
                }else{
                    map.put(no,cc-1);
                }
                low++;
                
                if(high == n-1) break;
                high++;
                
                int num = nums[high];
                sum += num;
                map.put(num,map.getOrDefault(num,0)+1);
            }
            high++;
            
        return ans;
        }
    }

