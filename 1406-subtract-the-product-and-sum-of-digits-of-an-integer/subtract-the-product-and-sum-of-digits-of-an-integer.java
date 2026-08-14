class Solution {
    public int subtractProductAndSum(int n) {
        int m=1;
        int sum=0;


        while(n>0){
            sum=sum+(n%10);
            m=m*(n%10);
            n=n/10;
        }
        int k = m-sum;
        return k;
        
    }
}