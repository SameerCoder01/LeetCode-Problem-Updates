class Solution {
    public int minimumDeletions(int[] arr) {

        int n = arr.length;
        
       
        
            
        int min = arr[0];
        int mini = 0;
        
        int max = arr[0];
        int maxi = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                mini = i;
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                maxi = i;
            }
        }

        int left = Math.max(mini+1, maxi+1);
        int right = Math.max(arr.length-mini,arr.length-maxi);

        int mix1 = (mini+1) + (arr.length - maxi);
        int mix2 = (maxi+1) + (arr.length - mini);

        int mix = Math.min(mix1,mix2);

        int del_op = Math.min(mix,Math.min(left,right));
        return del_op;
        
        // if(mini < arr.length/2 && maxi > arr.length/2)  {
        //     del_op += ((mini + 1) + (arr.length - maxi));
        // }else if(maxi < arr.length/2 && mini > arr.length/2){
        //     del_op += ((maxi+1) + (arr.length - mini));
        // }else if(mini < arr.length/2 && maxi < arr.length/2){
        //     del_op += Math.max(mini+1,maxi+1);
        // }else if(mini > arr.length/2 && maxi > arr.length/2){
        //     del_op += Math.max((arr.length-maxi),(arr.length-mini));
        // }else if(mini == arr.length/2 || maxi == arr.length/2){
        //     del_op += arr.length/2;
        // }
        // return del_op;
            
        

        

        
        
    }
}