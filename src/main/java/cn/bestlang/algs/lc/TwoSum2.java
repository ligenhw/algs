package cn.bestlang.algs.lc;

public class TwoSum2 {

    public int[] twoSum(int[] price, int target) {
        int i = 0;
        int j = price.length - 1;

        while (i < j) {
            int sum = price[i] + price[j];
            if (sum == target) {
                return new int[] {price[i], price[j]};
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }

        return new int[2];
    }
}
