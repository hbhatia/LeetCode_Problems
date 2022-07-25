class Solution {
    //Using bruteforce Simple Approach
    public void moveZeroes(int[] nums) {
        
        int len=nums.length;
        int zeroPos=-1;
        for(int i=0;i<len;i++){
            if(nums[i]!=0 && zeroPos!=-1){
                int temp=nums[i];
                nums[i]=nums[zeroPos];
                nums[zeroPos]=temp;
                zeroPos++;
            }
            else if(nums[i]==0 && zeroPos==-1){
                zeroPos=i;
            }
        }
    }
}