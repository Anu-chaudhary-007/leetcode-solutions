class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int max=0;

        int[] prev=new int[n];
        int[] nxt=new int[n];

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            while (!ad.isEmpty() && heights[ad.peek()] >= heights[i]){
                ad.pop();
            }
            if(ad.isEmpty()){
                prev[i]=-1;
            }else{
                prev[i]=ad.peek();
            }        
            ad.push(i);
        }

        ad.clear();

        for (int j = n - 1; j >= 0; j--) {
            while (!ad.isEmpty() && heights[ad.peek()] >= heights[j]){
                ad.pop();
            }
            if(ad.isEmpty()){
                nxt[j]=n;                    
            }else{
                nxt[j]=ad.peek();
            }
            ad.push(j);
        }

        for (int k = 0; k < n; k++) {
            int width = nxt[k] -prev[k] - 1;
            int area=width*heights[k];
            max = Math.max(max, area);
        }
        return max;        
    }
}