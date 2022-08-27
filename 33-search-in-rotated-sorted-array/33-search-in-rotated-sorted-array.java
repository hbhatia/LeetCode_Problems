class Solution {
    //Using the Approach 2 given in Solution
    //Uisng bs in one go
    public int search(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
           // int mid=left+(right-left)/2;
            int mid=(left+right)/2;
            int val=nums[mid];
            if(val==target) return mid;
            else if(nums[mid]>=nums[left]){
                if(target<nums[mid] && target>=nums[left]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            // else{
            //     if(target>=nums[left] && target<nums[mid]){
            //         right=mid-1;
            //     }
            //     else{
            //         left=mid+1;
            //     }
            // }
            //This above lines condition wont work 
            //For ex [4,5,6,7,1,2,3]
            //if nums[mid]=1 and t=5 So it will shift to right and will return -1
            else{
                if(target>nums[mid] && target<=nums[right]){
                    left=mid+1;
                  
                }
                else{
                      right=mid-1;
                }
            }
        }
        return -1;
    }
}