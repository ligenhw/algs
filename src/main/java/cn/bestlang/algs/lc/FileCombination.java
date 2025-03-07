package cn.bestlang.algs.lc;

import java.util.ArrayList;
import java.util.List;

public class FileCombination {

    public int[][] fileCombination(int target) {
        List<int[]> result = new ArrayList<>();

        for (int len = 2; len < target; len++) {
            int sum = nSum(len);

            if (sum > target) {
                break;
            }

            int lo = 1;
            while (sum < target) {
                sum += len;
                lo++;
            }
            if (sum == target) {
                result.add(newArray(lo, len));
            }
        }

        result = result.reversed();
        return result.toArray(new int[result.size()][]);
    }

    public int[] newArray(int lo, int len) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = lo++;
        }

        return arr;
    }

    private int nSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

}
