class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int result =0;
        int sorted[]=new int[n];
       
        for(int i=0;i<n;i++){
            sorted[i]=heights[i];
        }
         for(int i =0;i<n;i++ ){
            for(int j=0;j<n;j++){
                if(heights[j]>heights[i]){
                    int temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(heights[i]!=sorted[i]){
                result++;
            }
        }
        return result;
        
    }
}