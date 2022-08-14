class Solution {
    //Uisng Solution in Discuss Section.
    //Using four loops -Brute force way
    //Here we are targeting first possible and row and column accorindg to n-2 condition.
    //And then we are just traversing to that partucular matrix and finding maximu value
    //https://leetcode.com/problems/largest-local-values-in-a-matrix/discuss/2422378/Four-Loops
    public int[][] largestLocal(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] res=new int[m-2][n-2];
        for(int i=0;i<m-2;i++){
            for(int j=0;j<n-2;j++){
                for(int I1=i;I1<i+3;I1++){
                    for(int I2=j;I2<j+3;I2++){
                        res[i][j]=Math.max(res[i][j],grid[I1][I2]);
                    }
                }
            }
        }
        return res;
    }
}