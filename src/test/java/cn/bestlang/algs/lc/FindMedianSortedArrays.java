package cn.bestlang.algs.lc;

public class FindMedianSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = mergeArrays(nums1, nums2);
        int len = nums3.length;

        if (len == 0) {
            return 0;
        }

        if (len % 2 == 1) {
            int i = len / 2;
            return nums3[i];
        } else {
            int i = len / 2;
            return (nums3[i] + nums3[i - 1]) / 2.0;
        }
    }

    public int[] mergeArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] nums3 = new int[m + n];
        int index = 0;

        int i = 0;
        int j = 0;
        while (i < m || j < n) {
            int current;
            if (i == m) {
                current = nums2[j];
                j++;
            } else if (j == n) {
                current = nums1[i];
                i++;
            } else if (nums1[i] < nums2[j]) {
                current = nums1[i];
                i++;
            } else {
                current = nums2[j];
                j++;
            }
            nums3[index++] = current;
        }

        return nums3;
    }

}
