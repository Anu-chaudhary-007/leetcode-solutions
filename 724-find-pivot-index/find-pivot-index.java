class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        for(int i=0;i<n;i++){
            int leftSum = (i == 0) ? 0 : nums[i - 1];
            int rightSum = nums[n - 1] - nums[i];
            if (leftSum == rightSum) {
                return i;
        }
        }
        return -1;
        
    }
}