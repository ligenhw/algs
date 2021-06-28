package cn.bestlang.algs.offer2;

public class IsMatch {

    public boolean isMatch(String s, String p) {
        if (p.isEmpty() && s.isEmpty()) {
            return true;
        }

        if ((p.isEmpty() && !s.isEmpty())) {
            return false;
        }

        if (p.length() > 1 && p.charAt(1) == '*') {
            if (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.')) {
                return isMatch(s, p.substring(2)) || isMatch(s.substring(1), p);
            } else {
                return isMatch(s, p.substring(2));
            }
        } else {
            if (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.')) {
                return isMatch(s.substring(1), p.substring(1));
            } else {
                return false;
            }
        }
    }
}
