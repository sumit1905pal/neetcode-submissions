class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, j = i+1, max = 0;
        while(j<prices.length){
            if(prices[i] < prices[j]){
                int profit = prices[j] - prices[i];
                max = Math.max(max,profit);
                j++;
            }else{
                i = j;
                j++;
            }
        }
        return max;
    }
}
