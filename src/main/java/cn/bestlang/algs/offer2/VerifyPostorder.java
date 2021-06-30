package cn.bestlang.algs.offer2;

public class VerifyPostorder {
    public boolean verifyPostorder(int[] postorder) {
        return verifyPostorder(postorder, 0, postorder.length - 1);
    }

    private boolean verifyPostorder(int[] postorder, int lo, int hi) {
        int len = hi - lo;
        if (postorder == null || len <= 0) {
            return true;
        }

        int root = postorder[hi];
        int mid = lo;
        while (mid < hi && postorder[mid] < root) {
            mid++;
        }
        int right = mid;
        while (right < hi) {
            if (postorder[right++] < root) {
                return false;
            }

        }

        return verifyPostorder(postorder, lo, mid - 1) && verifyPostorder(postorder, mid, hi - 1);
    }
}
