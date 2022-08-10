class Solution {
    //Using Traversing Approach given in Discuss section
    //https://leetcode.com/problems/where-will-the-ball-fall/discuss/988576/JavaC%2B%2BPython-Solution-with-Explanation
    public int[] findBall(int[][] grid) {
        if(null==grid || grid.length==0){
            return new int[0];
        }
        int[] result=new int[grid[0].length];
        //Traversing columns wise
        for(int i=0;i<grid[0].length;i++){
            int currRow=0,currCol=i;
            while(currRow<grid.length){
                if(grid[currRow][currCol]==1 && currCol+1<grid[0].length && grid[currRow][currCol+1]==1){
                    currRow++;
                    currCol++;
                }
                else if(grid[currRow][currCol]==-1 && currCol-1>=0 && grid[currRow][currCol-1]==-1){
                    currRow++;
                    currCol--;
                }
                else{
                    break;
                }
            }
            result[i]=currRow==grid.length?currCol:-1;
        }
        return result;
    }
}