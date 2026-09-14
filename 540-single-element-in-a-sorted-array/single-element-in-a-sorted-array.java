class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n=arr.length;
        
        if(n==1) return arr[0];
        if(arr[0]!=arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        
        int l=1, r=n-2;
        while(l<=r){
            int m=(l+r)/2;
            if(arr[m]!=arr[m-1] && arr[m]!=arr[m+1]){
                return arr[m];
            }
            if((m%2==0 && arr[m]==arr[m+1]) || (m%2==1 && arr[m]==arr[m-1])){
                l=m+1;
            } else {
                r=m-1;
            }
        }
        return -1;
    }
}

