class Solution {
    public boolean canAliceWin(int n) {

        String next_turn = "Alice";

        int remove_next = 10;

        while(remove_next <= n){
            n -= remove_next;
            remove_next--;
            
            if(next_turn.equals("Alice")){
                next_turn = "Bob";
            }else{
                next_turn = "Alice";

            }
        }

        if(next_turn.equals("Alice")){
            return false;
        }else{
            return true;
        }
    }
}