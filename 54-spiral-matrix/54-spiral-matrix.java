class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int size=m*n;
        int sRow=0;
        int eRow=m-1;
        int sCol=0;
        int eCol=n-1;
        List<Integer> res=new ArrayList<Integer>();
        while(res.size()<size){
            //Traverse left to right
            for(int i=sCol;i<=eCol && res.size()<size;i++){
                res.add(matrix[sRow][i]);
            }
            sRow++;
            
            //Traverse top to bottom
            for(int i=sRow;i<=eRow && res.size()<size;i++){
                res.add(matrix[i][eCol]);
            }
            eCol--;
            
            //Traverse from right to left
            for(int i=eCol;i>=sCol && res.size()<size;i--){
                res.add(matrix[eRow][i]);
            }
            eRow--;
            
            //Traverse from bottom to up
            for(int i=eRow;i>=sRow && res.size()<size;i--){
                res.add(matrix[i][sCol]);
            }
            sCol++;
        }
        return res;
    }
}