class Solution {
    public String removeStars(String s) {
        Stack<Character>Stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch =='*'){
                Stack.pop();
            }
            else{
                Stack.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();
        for(char ch : Stack){
            result.append(ch);
        }
        return result.toString();
        
    }
}