class Solution {
    //Using the 2nd Approach given in Solution
    public int maxProfit(int[] prices) {
        int i=0;
        int valley=prices[0];
        int peak=prices[0];
        int ts=0;
        int len=prices.length;
        while(i<len-1){
            while(i<len-1 && prices[i]>=prices[i+1]){
                i++;
            }
            valley=prices[i];
            while(i<len-1 && prices[i]<=prices[i+1]){
                i++;
            }
            peak=prices[i];
            ts+=peak-valley;
        }
        return ts;
    }
}