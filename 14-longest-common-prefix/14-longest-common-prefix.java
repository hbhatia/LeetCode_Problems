class Solution {
    //Based on Second Solution
    //Vertical Scanning
    public String longestCommonPrefix(String[] strs) {
        int len=strs.length;
        for(int i=0;i<strs[0].length();i++){
            char c=strs[0].charAt(i);
            for(int j=1;j<len;j++){
                if(i==strs[j].length() || c!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}