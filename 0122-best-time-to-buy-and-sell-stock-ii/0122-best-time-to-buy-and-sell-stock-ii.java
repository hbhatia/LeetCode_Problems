class Solution {
    //Using the Approach of Min-Max or Peak_Valley Approach 
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=prices[0];
        int ts=0;
        int cs=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>=max){
                cs=prices[i]-min;
                max=prices[i];
            }
            else{
                ts+=cs;
                min=prices[i];
                max=prices[i];
                cs=0;
            }
        }
        return cs==0?ts:ts+cs;
    }
}