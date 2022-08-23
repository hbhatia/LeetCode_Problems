class Solution {
    //Using the bruteForce Approach
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowL=matrix.length;
        int colL=matrix[0].length;
        int i,j;
        for(i=0;i<rowL;i++){
            if(target>=matrix[i][0] && target <=matrix[i][colL-1]){
                break;
            }
        }
        for(j=0;i!=rowL && j<colL;j++){
            if(matrix[i][j]==target){
                return true;
            }
        }
        return false;
    }
}