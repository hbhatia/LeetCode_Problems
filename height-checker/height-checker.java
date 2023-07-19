class Solution {
    
    //Using the Bubble sort
    public int heightChecker(int[] heights) {
        int len=heights.length;
        int sort[]=new int[len];
        for(int i=0;i<len;i++){
            sort[i]=heights[i];
        }
        for(int i=0;i<len;i++){
            boolean swapped=false;
            for(int j=0;j<len-i-1;j++){
                if(heights[j]>=heights[j+1]){
                    int temp=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        int count=0;
        for(int i=0;i<len;i++){
            if(heights[i]!=sort[i]){
                count++;
            }
        }
        return count;
    }
}