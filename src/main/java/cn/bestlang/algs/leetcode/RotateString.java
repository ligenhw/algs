package cn.bestlang.algs.leetcode;

public class RotateString {
    public boolean rotateString(String s, String goal) {
        if (s.length() == 0 && goal.length() == 0) {
            return true;
        } else if (s.length() == 0) {
            return false;
        }

        String current = s;
        for (int i = 0; i < s.length(); i++) {
            current = rotate(current);
            if (current.equals(goal)) {
                return true;
            }
        }

        return false;
    }

    private String rotate(String s) {
        return s.substring(1) + s.charAt(0);
    }
}
