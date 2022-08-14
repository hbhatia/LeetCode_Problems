class Solution {
    //Using Solution 3 Provided by Leetcode
    //Using Divide and Conquer approach
    public String longestCommonPrefix(String[] strs) {
        if(null==strs || strs.length==0) return "";
        return findCommonPrefix(strs,0,strs.length-1);
    }
    public String findCommonPrefix(String strs[],int left ,int right){
        if(left==right){
            return strs[left];
        }
        int mid=(left+right)/2;
        String leftCommon=findCommonPrefix(strs,left,mid);
        String rightCommon=findCommonPrefix(strs,mid+1,right);
        return findMatchedPrefix(leftCommon,rightCommon);
    }
    public String findMatchedPrefix(String left,String right){
        int minLen=Math.min(left.length(),right.length());
        for(int i=0;i<minLen;i++){
            if(left.charAt(i)!=right.charAt(i)){
                return left.substring(0,i);
            }
        }
        return left.substring(0,minLen);
    }
}