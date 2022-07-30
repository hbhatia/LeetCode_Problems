class Solution {
    //Using BruteForce Approach
    public int longestPalindrome(String s) {
        int[] countChar=new int[128];
        for(char c:s.toCharArray()){
            countChar[c]++;
        }
        boolean isOdd=false;
        int palLength=0;
        for(int i=0;i<128;i++){
            if(countChar[i]%2==0){
                palLength+=countChar[i];
            }
            else{
                palLength+=(countChar[i]/2)*2;
                isOdd=true;
            }
        }
        return isOdd?++palLength:palLength;
    }
}