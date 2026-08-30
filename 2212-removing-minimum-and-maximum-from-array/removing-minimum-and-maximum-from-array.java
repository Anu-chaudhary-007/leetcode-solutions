class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min= 0, max = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[min]) min = i;
            if (nums[i] > nums[max]) max = i;
        }
        if (min > max) {
            int temp = min;
            min = max;
            max = temp;
        }
        int left = max + 1;
        int right = n - min;
        int bothSides = (min + 1) + (n - max);
        return Math.min(left, Math.min(right, bothSides));
    }
}
