class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int smallest=Integer.MAX_VALUE;
        int left =0;
        int right=n-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            smallest= Math.min(smallest,nums[mid]);
            if (nums[mid] < nums[right]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return smallest;
        
    }
}