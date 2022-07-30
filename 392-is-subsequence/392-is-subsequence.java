class Solution {
    public boolean isSubsequence(String s, String t) {
        int len1=s.length();
        int len2=t.length();
        if(len2<len1) return false;
        if(len1==0) return true;
        int pos=0;
        for(int i=0;i<len2 && pos<len1;i++){
            if(s.charAt(pos)==t.charAt(i)){
                pos++;
            }
        }
        return pos==len1;
    }
}