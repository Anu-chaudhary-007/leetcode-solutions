class Solution {
    public int missingNumber(int[] nums) {
        
        int xor = 0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            xor=xor+1;
            res=res^xor^nums[i];
        }
        return res;
    }
}