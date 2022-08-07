class Solution {
    //Using Array of size 10 i.e to keep values of 9 digits 
    //Using Approach given in this link
    //https://leetcode.com/problems/bulls-and-cows/discuss/74621/One-pass-Java-solution
    //Slighly better concise ways for previous version
    public String getHint(String secret, String guess) {
        int count[]=new int[10];
        int bulls=0;
        int cows=0;
        for(int i=0;i<guess.length();i++){
            char s=secret.charAt(i);
            char g=guess.charAt(i);
            if(s==g) bulls++;
            else{
                if(count[s-'0']<0) cows++;
                if(count[g-'0']>0) cows++;
                count[s-'0']++;
                count[g-'0']--;
            }
        }
        return new String(bulls+"A"+cows+"B");
    }
}