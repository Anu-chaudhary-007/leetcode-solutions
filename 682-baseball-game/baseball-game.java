class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<n;i++){
            if(operations[i].equals("C")){
                stack.pop();
            }
            else if(operations[i].equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(operations[i].equals("+")){
                int l = stack.peek();
                int sl = stack.get(stack.size()-2);
                stack.push(l+sl);
            }
            else{

                stack.push(Integer.parseInt(operations[i]));
            }

        }
        int total =0;
        while(!stack.isEmpty()){
            total+=stack.pop();
        }
        return total;
        
    }
}