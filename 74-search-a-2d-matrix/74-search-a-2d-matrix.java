class Solution {
    //Using the solution by lc
    //Here we will use concept of bs
    public boolean searchMatrix(int[][] matrix, int target) {
        if(null==matrix){
            return false;
        }
        int m=matrix.length;
        int n=matrix[0].length;
        //Appying here BS on whole matixes indices
        int low=0;
        int high=m*n-1;
        while(low<=high){
            int mid=(low+high)/2;
            int midEle=matrix[mid/n][mid%n];
            if(midEle==target){
                return true;
            }
            else if(midEle<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}