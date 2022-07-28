class Solution {
    public boolean isAnagram(String s, String t) {
        int[] countChar=new int[26];
        int len1=s.length();
        int len2=t.length();
        if(len1!=len2) return false;
        for(int i=0;i<len1;i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            countChar[c1-'a']++;
            countChar[c2-'a']--;
        }
        for(int i=0;i<26;i++){
            if(countChar[i]!=0) return false;
        }
        return true;
    }
}