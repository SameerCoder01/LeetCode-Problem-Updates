class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        // String[] arr = new String[n];
        ArrayList<String> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder("");

        for(int i=0; i<n; i++){
            list.add(nums[i] + "");
        }

        list.sort((a,b) -> {
            String s1 = a+b;
            String s2 = b+a;

            return s2.compareTo(s1);
        });

        for(int idx = 0; idx < n; idx++){
            sb.append(list.get(idx));
        }

        String ans = sb.toString();
        
        if(ans.charAt(0) == '0' && ans.charAt(ans.length()-1) == '0'){
            return "0";
        }

        return ans;
    }
}