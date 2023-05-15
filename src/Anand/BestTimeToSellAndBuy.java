package Anand;

public class BestTimeToSellAndBuy {
    public static void main(String[] args) {
        int[] arr = {7,6,4,3,1};

        int res = maxProfit(arr);
        System.out.println(res);
    }
    public static int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;

        int ans=0;
        for(int i=0; i<prices.length; i++){
            for(int j = i+1; j<prices.length; j++){

                ans = prices[i] - prices[j];
                if(ans > max) {
                    max = ans;
                }
            }
        }
        return ans;
    }
}
