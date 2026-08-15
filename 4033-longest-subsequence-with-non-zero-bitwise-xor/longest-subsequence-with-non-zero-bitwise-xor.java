class Solution {
    public int longestSubsequence(int[] nums) {
        int xor=nums[0];
        int non_zero=0;
        int ans=0;
        for(int i=1;i<nums.length;i++){
            
            xor = xor^nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                non_zero=1;
                break;
            }
            else{
                non_zero=0;
            }
        }
        if(xor!=0){
            ans= nums.length;

        }
        else if(xor==0 && non_zero==1){
            ans= nums.length -1;
        }
        else{
            ans=0;
        }
        return ans;
        
        
    }
}