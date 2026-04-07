package leetcodequestion.arrayquestion;
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=problem-list-v2&envId=array

/*
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
 */
public class MaxProfit {
    static int maxProfit(int [] prices){
        if(prices == null || prices.length <2 ) return 0;
        int buyPrice = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }else{
                int currentProfit = prices[i] - buyPrice;
                profit = Math.max(profit,currentProfit);

            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int ans = maxProfit(new int[] {7,1,5,3,6,4});
        System.out.println(ans);
        int ans2 = maxProfit(new int[] {7,6,4,3,1});
        System.out.println(ans2);

    }
}
