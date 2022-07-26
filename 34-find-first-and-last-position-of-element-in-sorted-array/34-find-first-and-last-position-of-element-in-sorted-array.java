class Solution {
    //Using two binary Search for first and last index
    public int[] searchRange(int[] nums, int target) {
        int[] retPos=new int[]{-1,-1};
        if(nums==null || nums.length==0){
            return retPos;
        }
        retPos[0]=findFirstPost(nums,target);
        retPos[1]=findLastPost(nums,target);
        return retPos;
    }
    public int findFirstPost(int[] nums,int target){
        int left=0;int right=nums.length-1;
        int start=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                start=mid;
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return start;
    }
    public int findLastPost(int[] nums,int target){
        int left=0;int right=nums.length-1;
        int last=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                last=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return last;
    }
}