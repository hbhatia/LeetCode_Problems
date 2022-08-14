class Solution {
    //Uisng brute force approach
    public int edgeScore(int[] edges) {
        long []count=new long[100002];
        for(int i=0;i<edges.length;i++){
            count[edges[i]]+=i;
        }
        long max=0;
        int maxI=0;
        for(int i=0;i<count.length;i++){
            if(count[i]>max){
                max=count[i];
                maxI=i;
            }
        }
        return maxI;
    }
}