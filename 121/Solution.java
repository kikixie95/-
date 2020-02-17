// brute force O(n^2)
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 0; i < prices.length-1; i++){
            for(int j = i+1; j < prices.length; j++){
                int diff = prices[j] - prices[i];
                max = Math.max(max,diff);
            }
        }
        return max;
    }
}

// O(n)
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            if(prices[i]< min) min = prices[i];
            max = Math.max(max,prices[i]-min);
        }
        return max;
    }
}