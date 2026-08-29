class Solution {
    public char repeatedCharacter(String s) {
        char an=' ';
        Set<Character>ans = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            
            if(ans.contains(c)){
                an=c;
                break;

            }
            ans.add(c);
        }
        return an;
        
    }
}