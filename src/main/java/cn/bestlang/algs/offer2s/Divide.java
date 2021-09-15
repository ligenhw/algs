package cn.bestlang.algs.offer2s;

public class Divide {
    public int divide(int a, int b) {
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
        while (la >= lb) {
            DivideData data = divideRecur(la, lb);

            la = data.left;
            result += data.sub;
            if (positive && result >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (!positive && result == Integer.MAX_VALUE + 1) {
                return Integer.MAX_VALUE;
            }
            if (data.left == 0) {
                break;
            }
        }

        return (int) (positive ? result : -result);
    }

    private DivideData divideRecur(long la, long lb) {
        if (la < lb) {
            return null;
        }

        long current = lb;
        long k = 1;
        while (la >= current * 2) {
            current *= 2;
            k *= 2;
        }

        DivideData data = new DivideData();
        data.sub = k;
        data.left = la - current;

        return data;
    }

    private static class DivideData {
        long sub;
        long left;
    }
}
