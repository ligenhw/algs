package cn.bestlang.algs.offer2;

public class SumNums {

    public int sumNums(int n) {
        int t = (int) Math.pow(n, 2);
        return (t + n) >> 1;
    }
}
