class Solution {
    //Uisng the BruteForce Approach
    public boolean isSubsequence(String s, String t) {
        int sLen=s.length();
        int tLen=t.length();
        if(sLen==0) return true;
        int sInd=0;
        for(int i=0;i<tLen && sInd<sLen;i++){
            char sChar=s.charAt(sInd);
            char tChar=t.charAt(i);
            if(sChar==tChar){
                sInd++;
            }
        }
        return sInd==sLen;
    }
}