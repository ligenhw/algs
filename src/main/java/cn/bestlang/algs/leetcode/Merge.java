package cn.bestlang.algs.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        List<int[]> result = new ArrayList<>();
        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            if (start > currentEnd) {
                result.add(new int[]{ currentStart, currentEnd});
                currentStart = start;
                currentEnd = end;
            } else if (end > currentEnd) {
                currentEnd = end;
            }
        }

        result.add(new int[]{ currentStart, currentEnd});
        return result.toArray(new int[result.size()][]);
    }
}
