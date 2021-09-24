package cn.bestlang.algs.leetcode;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len = m + n;
        for (int i = len - 1; i >= 0; i--) {
            if (m < 1) {
                nums1[i] = nums2[n - 1];
                n--;
                continue;
            }
            if (n < 1) {
                nums1[i] = nums1[m - 1];
                m--;
                continue;
            }

            int a = nums1[m - 1];
            int b = nums2[n - 1];
            if (a > b) {
                nums1[i] = a;
                m--;
            } else {
                nums1[i] = b;
                n--;
            }
        }
    }
}
