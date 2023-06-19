class Solution {
    public void reverseString(char[] s) {
        printReverse(0,s);
        
    }
    public void printReverse(int ind,char[] s){
        if(ind>=s.length/2) return;
        char temp=s[ind];
        s[ind]=s[s.length-ind-1];
        s[s.length-ind-1]=temp;
        printReverse(ind+1,s);
    }
}