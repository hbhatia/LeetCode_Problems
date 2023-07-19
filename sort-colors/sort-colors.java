class Solution {
    //Using simple Logic of keeping two pointer to keep 0 at left and 2 at right
    public void sortColors(int[] nums) {
        int len=nums.length;
        int left=0;
        int right=len-1;
        for(int i=0;i<=right;){
            if(nums[i]==0){
                if(i>left){
                    swap(nums,i--,left++);
                }
                
            }
            else if(nums[i]==2){
                if(i<right){
                    swap(nums,i--,right--);
                }
            }
            i++;
        }
    }
    public void swap(int[] nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}