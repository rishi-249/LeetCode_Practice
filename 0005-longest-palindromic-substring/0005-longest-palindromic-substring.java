class Solution {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len <= 1) {
            return s;
        }
        String str = s.substring(0, 1);
        int maxlen = 1;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (palindrome(s.substring(i, j + 1)) == true) {
                    int max = j - i + 1;
                    if (max > maxlen) {
                        str = s.substring(i, j + 1);
                        maxlen = max;
                    }
                    // maxlen = Math.max(maxlen, j - i + 1)
                }
            }
        }
        return str;
    }

    private boolean palindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}