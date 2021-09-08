package cn.bestlang.algs.offer2review;

public class NumWays {
    public int numWays(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }

        int n2 = 1;
        int n1 = 1;
        int current = 2;
        int i = 2;
        while (i <= n) {
            current = (n2 + n1) % 1000000007;

            n2 = n1;
            n1 = current;
            i++;
        }

        return current;
    }
}
