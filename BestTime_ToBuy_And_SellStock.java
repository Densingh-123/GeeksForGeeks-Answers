package GeeksForGeeksSolution;
import java.util.*;
public class BestTime_ToBuy_And_SellStock {
public static void main(String[] args) {
	Solution solution = new Solution();
	StringBuilder sb = new StringBuilder();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter stock prices separated by spaces: ");
	sb.append(sc.hasNextLine());
	String[] input = sb.toString().trim().split("\\s+");
	int[] prices = new int[input.length];
	for(int i=0;i<input.length;i++) {
		prices[i]=Integer.parseInt(input[i]);
	}
	int maxprofit= solution.maxProfit(prices);
	 System.out.println("Maximum Profit: " + maxprofit);
	 sc.close();
}
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; 
        int maxProfit = 0; 
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
               
                minPrice = prices[i];
            } else {
               
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit; 
    }
}
