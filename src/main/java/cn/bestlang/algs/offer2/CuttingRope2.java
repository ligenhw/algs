package cn.bestlang.algs.offer2;

public class CuttingRope2 {
    public int cuttingRope(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }

        int timeOf3 = n / 3;
        if (n % 3 == 1) {
            timeOf3--;
        }

        int timeOf2 = (n - timeOf3 * 3) / 2;

        long result = 1;
        for (int i = 0; i < timeOf3; i++) {
            result = result * 3 % 1000000007;
        }
        for (int i = 0; i < timeOf2; i++) {
            result = (result * 2) % 1000000007;
        }

        return (int) result;
    }

}
