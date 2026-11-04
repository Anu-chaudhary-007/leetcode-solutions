class Solution {
    
    int[] findPSEE(int[] h){
        int n=h.length;
        int[] pse=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<n;i++){
            while(!st.isEmpty() && h[st.peek()]>=h[i]){
                st.pop();
            }
            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return pse;
    }

    int[] findNSEE(int[] h){
        int n=h.length;
        int[] nse=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && h[st.peek()]>=h[i]){
                st.pop();
            }
            nse[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        return nse;
    }

    public int largestRectangleArea(int[] heights) {
        int n=heights.length;

        int[] pse=findPSEE(heights);
        int[] nse=findNSEE(heights);

        int maxArea=0;

        for(int i=0;i<n;i++){
            int width=nse[i]-pse[i]-1;
            int area=heights[i]*width;
            maxArea=Math.max(maxArea,area);
        }

        return maxArea;
    }
}