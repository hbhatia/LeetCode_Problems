class Solution {
    //Uisng Solution in Discuss Section.
    //https://leetcode.com/problems/largest-local-values-in-a-matrix/discuss/2422211/C%2B%2B-or-Simple-and-efficient-solution-or-TC%3AO((n-2)2)
    public int[][] largestLocal(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] res=new int[m-2][n-2];
        for(int i=1;i<=m-2;i++){
            for(int j=1;j<=n-2;j++){
                int maxV=0;
                maxV=Math.max(maxV,Math.max(grid[i-1][j-1],Math.max(grid[i-1][j],grid[i-1][j+1])));
                maxV=Math.max(maxV,Math.max(grid[i][j-1],Math.max(grid[i][j],grid[i][j+1])));
                maxV=Math.max(maxV,Math.max(grid[i+1][j-1],Math.max(grid[i+1][j],grid[i+1][j+1])));
                res[i-1][j-1]=maxV;
            }
        }
        return res;
    }
}