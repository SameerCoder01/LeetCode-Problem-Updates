class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int r = grid.length;
        int c = grid[0].length;

        boolean[][] visited = new boolean[r][c];
        // visited[0][0] = true;

        int cr = 0;
        int cc = 0;
        while(visited[cr][cc] != true && cr<r && cc<c){
            visited[cr][cc] = true;
            int nr = cr;
            int nc = cc;
            
            char ch = grid[nr][nc];
            if(ch == 'L'){
                nc = nc-1;
            }else if(ch == 'R'){
                nc = nc+1;
            }else if(ch == 'U'){
                nr = nr-1;
            }else{
                nr = nr+1;
            }

            if(nr >= r || nc >= c || nr < 0 || nc < 0){
                return new int[]{cr,cc};
            }

            if(visited[nr][nc] == false && nr<r && nc < c){
                
                cr = nr;
                cc = nc;
                // visited[nr][nc] = true;
            }else{
                int[] ans = {cr,cc};
                return ans;
            }
        }

        int[] arr = {cr,cc};
        return arr;

        
    }
}