class Solution {
    public int[][] insert(int[][] intervals, int[] newinterval) {
        List<int[]>res= new ArrayList<>();
        int i = 0;
        int n = intervals.length;
        while(i<n && intervals[i][1]<newinterval[0]){
            res.add(intervals[i++]);
        }
        while(i<n && intervals[i][0]<= newinterval[1]){
            newinterval[0]=Math.min(newinterval[0],intervals[i][0]);
            newinterval[1]= Math.max(newinterval[1],intervals[i][1]);
            i++;
        }
        res.add(newinterval);
        while(i<n){
            res.add(intervals[i++]);
        }
        return res.toArray(new int[res.size()][]);

        
    }
}