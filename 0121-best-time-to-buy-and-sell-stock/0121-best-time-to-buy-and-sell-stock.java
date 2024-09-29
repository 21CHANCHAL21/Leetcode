class Solution {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int maxProfit = 0;

        for(int i =1; i<prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
            }
            else{
                maxProfit = Math.max(prices[i]-buy, maxProfit);
            }
        }
        return maxProfit;
        // int maxProfit = 0;
        // int n = prices.length;
        // for(int i =0; i<n; i++){
        //     for(int j = i; j<n; j++){
        //         maxProfit = Math.max(maxProfit, prices[j]- prices[i]);
        //     }
        // }
        // return maxProfit;
        
    }
}