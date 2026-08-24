class Solution {
    public void sortColors(int[] arr) {
        int i=0,z=0,t=arr.length-1;
        while(i<=t){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i]= arr[z];
                arr[z]=temp;
                z++;
                i++;


            }
            else if(arr[i]==2){
                int temp=arr[i];
                arr[i]=arr[t];
                arr[t]=temp;
                t--;

            }
            else{
                i++;
            }
        }
        
    }
}