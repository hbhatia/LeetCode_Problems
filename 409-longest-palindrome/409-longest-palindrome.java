class Solution {
    //Using BruteForce Approach
    public int longestPalindrome(String s) {
        int[] countChar=new int[128];
        for(char c:s.toCharArray()){
            countChar[c]++;
        }
        int palLength=0;
        for(int i=0;i<128;i++){
            int val=countChar[i];
            palLength+=val/2*2;
            if(palLength%2==0 && val%2==1){
                palLength++;
            }
        }
        return palLength;
    }
}