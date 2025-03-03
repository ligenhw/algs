package cn.bestlang.algs.lc;

public class LongestPalindrome {

    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int maxLen = 0;
        String maxStr = toStr(chars, 0, 0);

        for (int i = 0; i < len; i++) {
            int lo = i - 1;
            int hi = i + 1;
            while (lo >= 0 && hi <= len - 1 && chars[lo] == chars[hi]) {
                int l = hi - lo;
                if (l > maxLen) {
                    maxLen = l;
                    maxStr = toStr(chars, lo, hi);
                }
                lo--;
                hi++;
            }
        }

        // odd
        for (int i = 0; i < len; i++) {
            int lo = i;
            int hi = i + 1;
            while (lo >= 0 && hi <= len - 1 && chars[lo] == chars[hi]) {
                int l = hi - lo;
                if (l > maxLen) {
                    maxLen = l;
                    maxStr = toStr(chars, lo, hi);
                }
                lo--;
                hi++;
            }
        }

        return maxStr;
    }

    public String toStr(char[] chars, int lo, int hi) {
        StringBuilder sb = new StringBuilder();
        for (int i = lo; i <= hi; i++) {
            sb.append(chars[i]);
        }

        return sb.toString();
    }

}
