public class BuyandSellStock {

    public static void main(String[] args) {
        
        int price[] = {7,1,5,3,6,4};

        int maxProfit = Integer.MIN_VALUE;
        int buyPrice = price[0];
        for(int i =0; i<price.length; i++){

            if(buyPrice < price[i]){
                int currProfit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, currProfit);
            }else{
                buyPrice = price[i];
            }
        }
      System.out.println("Maximum profit of stock : "+maxProfit);

    }
    

}
