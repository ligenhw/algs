package cn.bestlang.algs.leetcode;

public class CanThreePartsEqualSum {
    public boolean canThreePartsEqualSum(int[] arr) {
        int len = arr.length;
        int left = 1;
        int right = len - 2;

        int leftSum = arr[0];
        int rightSum = arr[len - 1];
        int midSum = 0;
        for (int i = left; i <= right; i++) {
            midSum += arr[i];
        }

        while (left <= right) {

            int l = left;
            int tmpLeftSum = leftSum;
            int tmpMidSum = midSum;
            while (l <= right) {
                if (tmpLeftSum == tmpMidSum && tmpMidSum == rightSum) {
                    return true;
                }
                tmpLeftSum += arr[l];
                tmpMidSum -= arr[l];
                l++;
            }

            midSum -= arr[right];
            rightSum += arr[right];
            right--;
        }

        return false;
    }
}
