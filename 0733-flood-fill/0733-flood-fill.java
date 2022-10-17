class Solution {
    //Using Approach 1 of solution
    //DFS Apporach
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]!=color)
        callDFS(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    public void callDFS(int[][] image ,int sr,int sc,int color,int oldColor){
        if(image[sr][sc]==oldColor){
            image[sr][sc]=color;
            if(sr>=1) callDFS(image,sr-1,sc,color,oldColor);
            if(sc>=1) callDFS(image,sr,sc-1,color,oldColor);
            if(sr+1<image.length) callDFS(image,sr+1,sc,color,oldColor);
            if(sc+1<image[0].length) callDFS(image,sr,sc+1,color,oldColor);
        }
    }
}