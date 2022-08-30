class Solution {
    //Using First Approach Given in Solution
    //Modify for better code
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<Integer>();
        while(!set.contains(n) && n!=1){
            set.add(n);
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