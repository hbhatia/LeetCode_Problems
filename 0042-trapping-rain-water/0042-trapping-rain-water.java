class Solution {
    //Using 4th Approch in Solution of Two Pointer Approach
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int countWater=0;
        int leftMax=0,rightMax=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=leftMax){
                    leftMax=height[left];
                }
                else{
                    countWater+=leftMax-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=rightMax){
                    rightMax=height[right];
                }
                else{
                    countWater+=rightMax-height[right];
                }
                right--;
            }
        }
        return countWater;
    }
}