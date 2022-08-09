class Solution {
    //Using First Approach given in Solution
    //Here we are using HashSet to keeping number already explored and getting next number by simpley dviding and modulus operator
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<Integer>();
        while(!set.contains(n) && n!=1){
            set.add(n);
            n=getNextNum(n);
        }
        return n==1;
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