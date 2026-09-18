class Solution {
    public int maxProductDifference(int[] nums) {
        int small1 = Integer.MAX_VALUE;
        int small2 = Integer.MAX_VALUE;
        int large1 = Integer.MIN_VALUE;
        int large2 = Integer.MIN_VALUE;
        for (int x : nums) {
            if (x<small1) {
                small2=small1;
                small1=x;
            } else if (x<small2) {
                small2=x;
            }
            if (x>large1) {
                large2=large1;
                large1=x;
            } else if (x>large2) {
                large2=x;
            }
        }
        return (large1*large2) - (small1*small2);
    }
}