package cn.bestlang.algs.offer2;

public class ConstructArr {
    public int[] constructArr(int[] a) {
        int[] result = new int[a.length];
        int[] left = new int[a.length];
        int[] right = new int[a.length];

        int r = 1;
        for (int i = 0; i < a.length; i++) {
            r *= a[i];
            left[i] = r;
        }

        r = 1;
        for (int i = a.length - 1; i >= 0; i--) {
            r *= a[i];
            right[i] = r;
        }

        for (int i = 0; i < a.length; i++) {
            int t = 1;
            if (i - 1 >= 0) {
                t *= left[i - 1];
            }
            if (i + 1 < a.length) {
                t *= right[i + 1];
            }

            result[i] = t;
        }
        return result;
    }
}
