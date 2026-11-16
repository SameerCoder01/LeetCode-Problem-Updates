class Solution {
    public String digitSum(String s, int k) {
        while(s.length() > k){
            
            int n = s.length();

            int i=0;
            StringBuilder newsb = new StringBuilder();
            while(i < s.length()){
                

                StringBuilder sb = new StringBuilder();

                if(i + k < s.length()){
                    sb = new StringBuilder(s.substring(i, i+k));
                }else{
                    sb = new StringBuilder(s.substring(i,s.length()));
                }

                int sum = 0;

                for(int j = 0; j < sb.length(); j++){
                    sum += sb.charAt(j) - '0';
                }

                newsb.append(String.valueOf(sum));

                i += k;
                

            }
            s = newsb.toString();
        }

        return s;
    }
}