package cn.bestlang.algs.lc;

public class SingleNumber {

    public int[] singleNumber(int[] nums) {

        return null;
    }

    public int singleNum(int[] nums) {
        int result = 0;
        for (int n : nums) {
            result ^= n;
        }
        return result;
    }

}
