package cn.bestlang.algs.lc;

import java.util.PriorityQueue;

public class SmallestK {

    public int[] smallestK(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int a : arr) {
            pq.add(a);
            if (pq.size() == k + 1) {
                pq.remove();
            }
        }

        int[] result = new int[pq.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = pq.remove();
        }

        return result;
    }
}
