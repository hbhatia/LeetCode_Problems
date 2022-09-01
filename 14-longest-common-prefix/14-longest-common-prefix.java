class Solution {
    //Based on Third Solution
    //Divide and Conquer
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1) return strs[0];
        return findCommonPrefix(strs,0,strs.length-1);
    }
    
    public String findCommonPrefix(String[] strs,int start,int end){
        if(start==end){
            return strs[start];
        }
        int mid=(start+end)/2;
        String leftCommon=findCommonPrefix(strs,start,mid);
        String rightCommon=findCommonPrefix(strs,mid+1,end);
        return findCommonString(leftCommon,rightCommon);
    }
    
    public String findCommonString(String left,String right){
        StringBuilder commonStr=new StringBuilder();
        int len=Math.min(left.length(),right.length());
        for(int i=0;i<len;i++){
            if(left.charAt(i)!=right.charAt(i)){
                return left.substring(0,i);
            }
        }
        return left.substring(0,len);
    }
}