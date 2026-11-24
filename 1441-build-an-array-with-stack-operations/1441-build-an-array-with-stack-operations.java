class Solution {
    public List<String> buildArray(int[] target, int n) {
        int i = 0;
        int j = 1;

        List<String> list = new ArrayList<>();

        while(i < target.length && j<=n){

            int count = 0;

            while(j != target[i]){

                count++;

                list.add("Push");
                j++;
                
            }
            while(count != 0){
                list.add("Pop");
                count--;
            }
            list.add("Push");
            i++;
            j++;
        }
        return list;
    }
}