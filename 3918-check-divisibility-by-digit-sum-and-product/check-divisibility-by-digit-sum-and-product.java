class Solution {
    public boolean checkDivisibility(int n) {
        int org =n;
        int sum =0;
        int mul=1;
        while(n>0){
            int k=0;
            k=n%10;
            sum=sum+k;
            mul=mul*k;
            n=n/10;
        }
        if(org%(sum+mul)==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}