package cn.bestlang.algs.offer2s;

public class Divide {
    public int divide(int a, int b) {
        long maxInt = Integer.MAX_VALUE;
        boolean positive = true;
        long la = a;
        if (a < 0) {
            positive = false;
            la = -la;
        }
        long lb = b;
        if (b < 0) {
            positive = !positive;
            lb = -lb;
        }

        long result = 0;
        if (lb == 1) {
            if (positive && la > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (!positive && la > maxInt + 1) {
                return Integer.MIN_VALUE;
            }
            return (int) (positive ? la : -la);
        }

        while (la >= lb) {
            la -= lb;
            if (positive && result == Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (!positive && result == Integer.MAX_VALUE + 1) {
                return Integer.MAX_VALUE;
            }
            result++;
        }

        return (int) (positive ? result : -result);
    }
}
