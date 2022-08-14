class Solution {
    public int edgeScore(int[] edges) {
        long []count=new long[100002];
        // System.out.println(edges.length+ " "+ count[0]+ " "+ count[1]);
        for(int i=0;i<edges.length;i++){
            count[edges[i]]+=i;
            if(i==edges.length/2)
                System.out.println(count[0]+ " "+ count[1]);
        }
        long max=0;
        int maxI=0;
        // System.out.println(count[0]+ " "+ count[1]);
        for(int i=0;i<count.length;i++){
            if(count[i]>max){
                max=count[i];
                maxI=i;
            }
        }
        return maxI;
    }
}