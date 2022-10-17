class Solution {
    //Using Recursion calls but with memorization
    Integer[] fibArr=new Integer[31];
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        if(fibArr[n]!=null){
            return fibArr[n];
        }
        fibArr[n]=fib(n-1)+fib(n-2);
        return fibArr[n];
    }
}