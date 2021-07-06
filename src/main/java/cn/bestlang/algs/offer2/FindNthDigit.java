package cn.bestlang.algs.offer2;

public class FindNthDigit {
    public int findNthDigit(int n) {
        int topN = findTopN(n);
        int baseN = topN - 1;
        int base = (int) fSum(baseN);
        int v = n - base;
        int a = (v - 1) / topN;
        int number = (int) (Math.pow(10, baseN) + a);
        int b = (v - 1) % topN;

        int v1 = number % (int) Math.pow(10, topN - b);
        int v2 = v1 / (int) Math.pow(10, (topN - b - 1));
        return v2;
    }

    private int findTopN(int num) {
        double sum = 0;
        int n = 0;
        while(sum < num) {
            sum += f(++n);
        }

        return n;
    }

    private long f(int n) {
        if (n == 0) {
            return 0;
        }
        return (long) (9 * Math.pow(10, n - 1) * n);
    }

    private long fSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += f(i);
        }

        return sum;
    }
}
