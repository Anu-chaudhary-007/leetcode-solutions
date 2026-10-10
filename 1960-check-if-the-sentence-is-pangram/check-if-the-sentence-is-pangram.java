class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        HashSet <Character> map = new HashSet<>();
        for(int i=0;i<n;i++){
            map.add(sentence.charAt(i));
        }
        if(map.size()==26){
            return true;
        }
        else{
            return false;
        }

        
    }
}