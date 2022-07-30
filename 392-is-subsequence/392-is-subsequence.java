class Solution {
    //Using DP with Greedy Appproach and with recursive Calls
    String str1;
    String str2;
    int len1;
    int len2;
    public boolean isSubsequence(String s, String t) {
        this.str1=s;
        this.str2=t;
        this.len1=s.length();
        this.len2=t.length();
        return findIsSubseq(0,0);
    }
    public boolean findIsSubseq(int leftIndex,int rightIndex){
        if(leftIndex==len1) return true;
        if(rightIndex==len2) return false;
        //Computing correct Left and Right Index for next calls
        if(str1.charAt(leftIndex)==str2.charAt(rightIndex)) {
            leftIndex++;
        }
        rightIndex++;
        return findIsSubseq(leftIndex,rightIndex);
    }
}