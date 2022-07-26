class Solution {
    //Using Binary Search Solution two times given in Solution
    public int[] searchRange(int[] nums, int target) {
        int[] retPos=new int[]{-1,-1};
        int first=findTargetPosition(nums,target,true);
        if(first==-1) return retPos;
        int last=findTargetPosition(nums,target,false);
        retPos[0]=first;
        retPos[1]=last;
        return retPos;
    }
    public int findTargetPosition(int[] nums,int target,boolean first){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                if(first){
                    if(left==mid || nums[mid-1]!=target){
                        return mid;
                    }
                    right=mid-1;
                }
                else{
                    if(right==mid || nums[mid+1]!=target){
                        return mid;
                    }
                    left=mid+1;
                }
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;
    }
}