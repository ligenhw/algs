package cn.bestlang.algs.leetcode;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        Index index = binarySearch(nums, target, 0, nums.length - 1);
        if (index == null) {
            return new int[] {-1, -1};
        } else {
            Index leftIndex = index;
            Index lastLeftIndex = index;
            while (leftIndex != null) {
                lastLeftIndex = leftIndex;
                leftIndex = binarySearch(nums, target, leftIndex.lo, leftIndex.mid - 1);
            }

            Index rightIndex = index;
            Index lastRightIndex = index;
            while (rightIndex != null) {
                lastRightIndex = rightIndex;
                rightIndex = binarySearch(nums, target, rightIndex.mid + 1, rightIndex.hi);
            }

            return new int[] {lastLeftIndex.mid, lastRightIndex.mid};
        }
    }

    private static class Index {
        private int lo;
        private int mid;
        private int hi;

        public Index(int lo, int mid, int hi) {
            this.lo = lo;
            this.mid = mid;
            this.hi = hi;
        }
    }

    private Index binarySearch(int[] nums, int target, int lo, int hi) {
        if (lo > hi) {
            return null;
        }

        int mid = (lo + hi) / 2;
        if (nums[mid] > target) {
            return binarySearch(nums, target, lo, mid - 1);
        } else if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, hi);
        } else {
            return new Index(lo, mid, hi);
        }
    }
}
