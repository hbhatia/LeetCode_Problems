class Solution {
    //Using Second Approach given in Solution
    //We will use slow and fast number in this approach
    public boolean isHappy(int n) {
       int slow=n,fast=n;
      do{
           slow=getNextNum(slow);
           fast=getNextNum(fast);
           fast=getNextNum(fast);
       }while(slow!=fast && fast!=1);
        return fast==1;
       /*
       This will also work in same way because 1^1 is always 1.
       do{
           slow=getNextNum(slow);
           fast=getNextNum(fast);
           fast=getNextNum(fast);
       }while(slow!=fast && slow!=1);
        return slow==1;
       */
    }
    public int getNextNum(int n){
        int num=0;
        while(n!=0){
            int r=n%10;
            num+=r*r;
            n=n/10;
        }
        return num;
    }
}