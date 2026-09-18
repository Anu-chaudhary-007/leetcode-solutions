class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = 0;
        int r = n-1;
        int rs=1;
        int ls =1;
        int s=2;
        while(s>0){
            rs = rs*nums[r];
            ls =  ls *nums[l];
            l++;
            r--;
            s--;
        }
        return rs-ls;
        
    }
}