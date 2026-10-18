class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String j = words[i];
            int n = words[i].length();
            int left =0;
            int right = n-1;
            boolean ispal=true;
            while(right>=left){
                if(j.charAt(left)!=j.charAt(right)){
                    ispal=false;
                    break;
                }
                left++;
                right--;
                
            }
            if(ispal) return j;
        }
        return "";
        
    }
}