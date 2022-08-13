class Solution {
    //Using Approach 1 provided by Solution
    //TC- O(S)
    //It will be equals to sum of length of all strings
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix=="") return prefix;
            }
        }
        return prefix;
    }
}