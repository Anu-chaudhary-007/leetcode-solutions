class Solution {
    public int buyChoco(int[] prices, int money) {
         int n = prices.length;
        int s =Integer.MAX_VALUE;
        int ss=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if(prices[i]<s){
                ss = s;
                s = prices[i];
            }
            else if(prices[i]<ss){
                ss = prices[i];
            }
        }
        if(money-(s+ss)>=0){
            return(money-(s+ss));
        }
        else{
            return money;
        }
        
    }
}