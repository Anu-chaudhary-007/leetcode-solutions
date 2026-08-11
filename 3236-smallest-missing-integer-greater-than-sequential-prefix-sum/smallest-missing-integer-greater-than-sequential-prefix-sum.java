class Solution {
    public int missingInteger(int[] nums) {
        int sum =nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum=sum+nums[i];
            }
            else{
                break;
            }
            
        }
        for(;;) {
            boolean found = false;

            for(int j = 0; j < nums.length; j++) {
                if(sum == nums[j]) {
                    found = true;
                    break;
                }
            }

            if(!found)
                return sum;

            sum++;
        }
        
    }
}