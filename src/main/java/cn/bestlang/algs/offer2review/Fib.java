package cn.bestlang.algs.offer2review;

public class Fib {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int n2 = 0;
        int n1 = 1;
        int i = 2;
        int n0 = 1;
        while (i <= n) {
            n0 = (n1 + n2) % 1000000007;
            n2 = n1;
            n1 = n0;
            i++;
        }

        return n0;
    }
}
