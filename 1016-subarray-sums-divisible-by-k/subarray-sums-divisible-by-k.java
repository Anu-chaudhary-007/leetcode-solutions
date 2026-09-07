class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int[] count = new int[k];
        count[0]=1;
        int res=0,sum=0;
        for(int num : nums){
            sum+=num;
            int mod = ((sum % k) + k) % k;
            res += count[mod];
            count[mod]++;
        }
        return res;

        
    }
}