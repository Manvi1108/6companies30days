public class leetcode121{
    public int maxProfit(int[] prices)
    {
        int n = prices.length;
        int buy = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++)
        {
            buy = Math.min(buy,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i]-buy);
        }
        return maxProfit;
    }
}
