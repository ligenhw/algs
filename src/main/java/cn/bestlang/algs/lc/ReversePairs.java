package cn.bestlang.algs.lc;

public class ReversePairs {

    public int reversePairs(int[] record) {
        if (record.length < 2) {
            return 0;
        }

        int pre = 0;
        for (int i = 1; i < record.length; i++) {
            int count = getCount(record, i);
            pre = pre + count;
        }

        return pre;
    }

    public int getCount(int[] record, int i) {
        int cur = record[i];
        int count = binarySearch(record, 0, i - 1, record[i]);
        int start = i - count;
        System.arraycopy(record, start, record, start + 1, count);
        record[start] = cur;
        return count;
    }

    public int binarySearch(int[] record, int lo, int hi, int target) {
        if (lo > hi) {
            return 0;
        }

        int mid = (lo + hi) / 2;
        if (record[mid] > target) {
            return (hi - mid + 1) + binarySearch(record, lo, mid - 1, target);
        } else {
            return binarySearch(record, mid + 1, hi, target);
        }
    }
}
