class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> s = new Stack<>();
        for(int i=0;i<nums.length;i++){
            long curr = nums[i];
            while(!s.isEmpty() && s.peek()==curr){
                s.pop();
                curr*=2;
            }
                s.push(curr);
        }
        return new ArrayList<> (s);
    }
}