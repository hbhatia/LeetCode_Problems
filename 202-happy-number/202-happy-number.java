class Solution {
    //Using Second Approach Given in Solution
    //Here we are using Floyed Cycle _finding ALgo
    //Concept of Slow and Fast Pointers.
    public boolean isHappy(int n) {
        int slow=n;
        int fast=getNextNum(n);
        while(fast!=1 && slow!=fast){
            slow=getNextNum(slow);
            fast=getNextNum(getNextNum(fast));
        }
        return fast==1;
    }
    public int getNextNum(int num){
        int res=0;
        int r=0;
        while(num!=0){
            r=num%10;
            res=res+(r*r);
            num/=10;
        }
        return res;
    }
}