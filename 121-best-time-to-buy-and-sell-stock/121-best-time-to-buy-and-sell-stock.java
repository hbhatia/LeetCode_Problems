class Solution {
    //Using One pass -Better way
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        int len=prices.length;
        for(int i=0;i<len;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            else if(prices[i]-minPrice>maxProfit){
                maxProfit=prices[i]-minPrice;
            }
        }
        return maxProfit;
    }
}