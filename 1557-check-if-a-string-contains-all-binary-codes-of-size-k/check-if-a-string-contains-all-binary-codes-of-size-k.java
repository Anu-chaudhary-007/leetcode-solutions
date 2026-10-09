class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String>set = new HashSet<>();
        int total = 1<<k;
        for(int i=0;i<=s.length()-k;i++){
            String sub = s.substring(i,i+k);
            set.add(sub);
        }
        return set.size()==total;
    }
}