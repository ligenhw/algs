package cn.bestlang.algs.offer2;

import java.util.Arrays;

public class GetLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        return getLeastNumbers(arr, k, 0, arr.length - 1);
    }

    public int[] getLeastNumbers(int[] arr, int k, int left, int right) {
        if (left > right || k == 0) {
            return new int[]{};
        }
        int p = partition(arr, left, right);
        if (p + 1 == k) {
            return Arrays.copyOf(arr, k);
        } else if (p + 1 > k) {
            return getLeastNumbers(arr, k, left, p - 1);
        } else {
            return getLeastNumbers(arr, k, p + 1, right);
        }
    }

    int partition(int[] arr, int left, int right) {
        int mid = arr[left];
        int l = left + 1;
        int r = right;
        while(l <= r) {
            while (l <= right && arr[l] < mid) {
                l++;
            }
            while (r >= left && arr[r] > mid) {
                r--;
            }
            if (l <= r) {
                exchange(arr, l, r);
                l++;
                r--;
            }
        }
        exchange(arr, left, r);
        return r;
    }

    private void exchange(int[] arr, int l, int r) {
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }
}
