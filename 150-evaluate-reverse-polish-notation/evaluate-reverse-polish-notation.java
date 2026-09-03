class Solution {
    public int evalRPN(String[] token) {
        int n = token.length;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<n;i++){
            if(token[i].equals("+")){
                int a =s.pop();
                int b =s.pop();
                s.push(b+a);
            }
            else if(token[i].equals("-")){
                int a =s.pop();
                int b= s.pop();
                s.push(b-a);
            }
            else if(token[i].equals("*")){
                int a=s.pop();
                int b=s.pop();
                s.push(b*a);
            }
            else if(token[i].equals("/")){
                int a =s.pop();
                int b=s.pop();
                s.push(b/a);
            }
            else {
                s.push(Integer.parseInt(token[i]));
            }
            
            
        }
        return s.pop();
        
    }
}