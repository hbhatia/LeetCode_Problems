class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=new ArrayList<Integer>();
        if(matrix.length==0){
            return res;
        }
        int m=matrix.length;
        int n=matrix[0].length;
        int startR=0,endR=m-1,startC=0,endC=n-1;
        
        //This condition can also be used
        //while(startR<=endR && startC<=endC{
        while(res.size()<m*n){
            //Traverse Right
            for(int i=startC;i<=endC;i++){
                res.add(matrix[startR][i]);
            }
            startR++;

            //TraverseDown
            for(int i=startR;i<=endR;i++){
                res.add(matrix[i][endC]);
            }
            endC--;

            //Traverse Left
            if(startR<=endR)
            for(int i=endC;i>=startC;i--){
                res.add(matrix[endR][i]);
            }
            endR--;

            //TraverseUp
            if(startC<=endC)
            for(int i=endR;i>=startR;i--){
                res.add(matrix[i][startC]);
            }
            startC++;
        }
        return res;
    }
}