class Solution {
    //Using bruteforce Iteration calls
    public int fib(int n) {
       int[] fib=new int[31];
       fib[0]=0; 
       fib[1]=1;
       if(n<=1) return fib[n];
       for(int i=2;i<=n;i++){
           fib[i]=fib[i-1]+fib[i-2];
       }
        return fib[n];
    }
}