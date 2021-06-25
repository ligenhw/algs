package cn.bestlang.algs.offer2;

public class Fib {

    public int fib(int n) {
        if (n < 2) {
            return n;
        }

        int a = 0;
        int b = 1;
        int val = 0;
        for (int i = 3; i <= n; i++) {
            val = a + b;
            a = b;
            b = val;
        }

        return val;
    }
}
