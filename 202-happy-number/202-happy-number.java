class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<Integer>();
        while(!set.contains(n)){
            set.add(n);
            n=getNextNum(n);
            if(n==1){
                return true;
            }
        }
        return false;
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