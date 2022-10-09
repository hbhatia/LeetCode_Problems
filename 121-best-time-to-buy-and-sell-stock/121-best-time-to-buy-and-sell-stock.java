class Solution {
    public int maxProfit(int[] prices) {
        int minVal=Integer.MAX_VALUE;
        int maxP=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minVal){
                minVal=prices[i];
            }
            else {
                maxP=Math.max(maxP,prices[i]-minVal);
            }
        }
        return maxP;
    }
}