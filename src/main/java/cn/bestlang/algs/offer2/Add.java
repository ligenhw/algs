package cn.bestlang.algs.offer2;

public class Add {
    public int add(int a, int b) {
        if (b == 0) {
            return a;
        }

        return add(a ^ b, (a & b) << 1);
    }
}
