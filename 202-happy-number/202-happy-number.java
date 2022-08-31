class Solution {
    //Using 3rd Approach Given in Solution
    public boolean isHappy(int n) {
        int res=0;
        while(n!=1 && n!=4){
            n=getNextNum(n);
        }
        return n==1;
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