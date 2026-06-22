public class bestDaytoBuyAndSellStocks {
    public static int  bestDaytoBuyAndSellStockss(int[] a) {
        int maxProfit = 0;
        int bestBuy = a[0];
        for(int i =1 ; i<a.length; i++){
            if(a[i]>bestBuy){
                maxProfit = Math.max(maxProfit , a[i]-bestBuy );
            }
            bestBuy = Math.min(bestBuy,a[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        
    }
}
