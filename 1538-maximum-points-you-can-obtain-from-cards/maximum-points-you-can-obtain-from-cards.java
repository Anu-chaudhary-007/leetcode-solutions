class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalsum=0;
        for(int i=0;i<n;i++){
            totalsum+=cardPoints[i];
        }
        int size = n-k;
        if(size==0){
            return totalsum;
        }
        int windowsum=0;
        for(int i=0;i<size;i++){
            windowsum+=cardPoints[i];
        }
        int minsum=windowsum;
        for(int i=size;i<n;i++){
            windowsum+=cardPoints[i]-cardPoints[i-size];
            minsum=Math.min(minsum,windowsum);
        }
        return totalsum - minsum;
        
    }
}