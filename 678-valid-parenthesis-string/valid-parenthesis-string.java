class Solution {
    public boolean checkValidString(String s) {
        int open = 0;
        int close = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
                close++;
            } else if (s.charAt(i) == ')') {
                open--;
                close--;
            } else {
                open--;
                close++;
            }

            if (close < 0) {
                return false;
            }

            open = Math.max(open, 0);
        }

        return open == 0;
    }
}