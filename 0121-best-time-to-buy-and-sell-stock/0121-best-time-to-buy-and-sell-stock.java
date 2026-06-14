class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int n=prices.length;
        int buyprice=prices[0];
        for(int i=1;i<n;i++){
            buyprice=Math.min(prices[i],buyprice);
            profit=Math.max(prices[i]-buyprice,profit);
        }
        return profit;
    }
}