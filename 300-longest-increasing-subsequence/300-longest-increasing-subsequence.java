class Solution {
    public int lengthOfLIS(int[] nums) {
        //Using Dp Apporach from Solution With Binary Search
        int len=0;
        int [] dp=new int[nums.length];
        for(int num:nums){
            int index=Arrays.binarySearch(dp,0,len,num);
            if(index<0){
                index=-(index+1);
            }
            dp[index]=num;
            if(index==len){
                len++;
            }
        }
        return len;
    }
    
}