class Solution {
    public int minimumDistance(int[] nums) {
        HashMap<Integer, int[]> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new int[]{i, -1});
            } 
            else {
                int[] arr = map.get(nums[i]);

                if (arr[1] == -1) {
                    arr[1] = i;
                } 
                else {
                    int distance = 2 * (i - arr[0]);
                    ans = Math.min(ans, distance);
                    arr[0] = arr[1];
                    arr[1] = i;
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}