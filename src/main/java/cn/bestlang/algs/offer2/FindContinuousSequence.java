package cn.bestlang.algs.offer2;

import java.util.ArrayList;
import java.util.List;

public class FindContinuousSequence {
    public int[][] findContinuousSequence(int target) {
        if (target < 3) {
            return new int[][]{};
        }

        List<int[]> lists = new ArrayList<>();

        int left = 1;
        int right = 2;
        int sum = 3;
        while (right <= (target / 2 + 1)) {
            if (sum < target) {
                right++;
                sum += right;
            } else if (sum > target) {
                sum -= left;
                left++;
                //
            } else {
                int[] list = new int[right - left + 1];
                for (int i = 0; i < right - left + 1; i++) {
                    list[i] = left + i;
                }
                lists.add(list);

                right++;
                sum = sum - left + right;
                left++;
            }
        }

        return lists.toArray(new int[lists.size()][]);
    }
}
