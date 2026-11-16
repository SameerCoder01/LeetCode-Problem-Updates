class Solution {
    public int myAtoi(String s) {

        if(s.length() == 0) return 0;

        String str = s.trim();
        
        if(str.length() == 0) return 0;

        long num = 0;

        boolean minus = false;
        boolean plus = false;

        boolean reached = false;

        if(str.charAt(0) == '-'){
            minus = true;
        }
        if(str.charAt(0) == '+'){
            plus = true;
        }


        int i = 0;

        if(minus || plus){
            i++;
        }
        
        while(i < str.length()){
            char ch = str.charAt(i);

            if(!Character.isDigit(ch)){ // Learn ..............
                break;
            }

            int no = ch - '0';
            num = num * 10 + no;

            if(num > Integer.MAX_VALUE){
                reached = true;
                break;
            }  
            i++;                      
        }

        if(minus){
            num *= -1;
        }

        if(reached){
            if(num < 0){
                return Integer.MIN_VALUE;
            }else{
                return Integer.MAX_VALUE;
            }
        }
        
        return (int)num;
    }
}