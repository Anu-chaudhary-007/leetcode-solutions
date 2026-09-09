class Solution {
    public int countNegatives(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        
        for (int i=0;i<n;i++){
            int low = firstNegativeIndex(grid[i],0,m-1);
            count += (m - low);
        }
        
        return count;
    }
    
    private int firstNegativeIndex(int[] row, int low, int high) {
        while (low<=high) {
            int mid = low+(high-low)/2;
            if (row[mid]>=0) {
                low=mid+1;
            } else {
                high =mid-1;
            }
        }
        return low;
    }
}
