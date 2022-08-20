class Solution {
    //Using Solution and Approach given in link
    //https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/discuss/1675693/JavaPython-3-One-pass-w-brief-explanation-and-analysis.
    //Here we are usinhg HashMap as were using in prev solution
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> unpaired=new HashMap<String,Integer>();
        int countP=0;
        int sym=0;
        for(String word:words){
            String reverse =new StringBuilder(word).reverse().toString();
            if(unpaired.getOrDefault(reverse,0)>0){
                countP++;
                unpaired.put(reverse,unpaired.getOrDefault(reverse,0)-1);
                sym-=(word.charAt(0)==word.charAt(1)?1:0);
            }
            else{
                unpaired.put(word,unpaired.getOrDefault(word,0)+1);
                sym+=(word.charAt(0)==word.charAt(1)?1:0);
            }
        }
        return countP*4+(sym>0?2:0);
    }
}