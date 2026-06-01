class Solution {
    public int maxProfit(int[] prices) {
        int ans= 0 ; 
        for(int i = 0 ; i<prices.length ; i++){
            int max = -1;
            for(int j = i+1 ; j<prices.length ; j++){
                if(prices[i]<prices[j]){
                    max = Math.max(max , prices[j]-prices[i]);
                }
            }
            ans = Math.max(ans , max);
        }
        return ans;
    }
}
