class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for(int i=1;i<=n;i++){
            boolean db3 = i%3==0;
            boolean db5 = i%5==0;
            String currstr="";
            if(db3 && db5){
                ans.add("FizzBuzz");
            }
            else if(db3){
                ans.add("Fizz");

            }
            else if(db5){
                ans.add("Buzz");
            }
            else{
                ans.add(String.valueOf(i));
            }
        }
        return ans;

        
    }
}