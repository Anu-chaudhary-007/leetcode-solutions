class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;
        int k = n/3;
        int ans =0;
        Arrays.sort(piles);
        int l = k; 
        while(l<n){
            
            ans = ans+piles[l];
            l= l+2;
        }
        return ans;
        
    }
}