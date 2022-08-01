class Solution {
    //Using Approach of DP 
    //NO TLE in this approach
    //TC-O(N*M) is time complexity
    public int uniquePaths(int m, int n) {
        int[][] matrix=new int[m][n];
        // for(int[] arr:matrix){
        //     Arrays.fill(matrix,1);
        // }
        //Or we can also fill only first and first column with value 1
        for(int i=0;i<m;i++){
            matrix[i][0]=1;
        }
        for(int i=0;i<n;i++){
            matrix[0][i]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                matrix[i][j]=matrix[i][j-1]+matrix[i-1][j];
            }
        }
        return matrix[m-1][n-1];
    }
}