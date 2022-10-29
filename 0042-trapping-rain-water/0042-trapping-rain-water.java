class Solution {
    //Using Brute Force Approach
    //This has TC- O(N) and SC is O(N)
    public int trap(int[] height) {
        int len=height.length;
        int leftMax[]=new int[len];
        int rightMax[]=new int[len];
        leftMax[0]=height[0];
        rightMax[len-1]=height[len-1];
        
        for(int i=1;i<len;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        
        for(int i=len-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        int countWater=0;
        for(int i=0;i<len;i++){
            countWater+=Math.min(leftMax[i],rightMax[i])-height[i];
        }
        return countWater;
    }
}