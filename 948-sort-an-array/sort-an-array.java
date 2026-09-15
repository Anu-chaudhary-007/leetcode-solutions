class Solution {
    public int[] sortArray(int[] nums) {
        int[] count = new int[100001];

        for (int x : nums)
            count[x + 50000]++;

        int k = 0;

        for (int i = 0; i < count.length; i++)
            while (count[i]-- > 0)
                nums[k++] = i - 50000;

        return nums;
    }
}