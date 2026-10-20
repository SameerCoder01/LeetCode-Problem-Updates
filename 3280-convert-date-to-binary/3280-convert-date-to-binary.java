class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder year = new StringBuilder();
        year.append(date,0,4);

        StringBuilder month = new StringBuilder();
        month.append(date,5,7);

        StringBuilder day = new StringBuilder();
        day.append(date,8,10);

        String yb = Integer.toBinaryString(Integer.parseInt(String.valueOf(year)));
        String mb = Integer.toBinaryString(Integer.parseInt(String.valueOf(month)));
        String db = Integer.toBinaryString(Integer.parseInt(String.valueOf(day)));

        StringBuilder ans = new StringBuilder();
        ans.append(yb);
        ans.append("-");
        ans.append(mb);
        ans.append("-");
        ans.append(db);

        return ans.toString();



    }
}