class Solution {
    public int numberOfSteps(int num) {
        int count =0;
        int remaining=num;
        while(remaining>0){
            if(remaining%2==0){
                remaining=remaining/2;
                count++;
            }
            else{
                remaining=remaining-1;
                count++;

            }
        }
        return count;
        
    }
}