class Solution {
    //Using first Approach in the Solution
    //DFS Traversal
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0) {
            return 0;
        }
        int numIsland=0;
        int rLen=grid.length;
        int cLen=grid[0].length;
        for(int r=0;r<rLen;r++){
            for(int c=0;c<cLen;c++){
                if(grid[r][c]=='1'){
                    numIsland++;
                    dfs(grid,r,c);
                }
            }
        }
        return numIsland;
    }
    public void dfs(char[][] grid,int r,int c){
        int rLen=grid.length;
        int cLen=grid[0].length;
        if(r<0 || c<0 || r>=rLen || c>=cLen || grid[r][c]=='0'){
            return;
        }
        grid[r][c]='0';
        dfs(grid,r+1,c);
        dfs(grid,r,c+1);
        dfs(grid,r-1,c);
        dfs(grid,r,c-1);
    }
}