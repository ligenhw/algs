package cn.bestlang.algs.offer2;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MinNumber {
    public String minNumber(int[] nums) {
        PriorityQueue<String> queue = new PriorityQueue<>(new MyComparator());
        for (int num : nums) {
            queue.add(String.valueOf(num));
        }

        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            sb.append(queue.poll());
        }
        return sb.toString();
    }

    static class MyComparator
            implements Comparator<String> {

        public int compare(String s1, String s2) {
            int n1 = s1.length();
            int n2 = s2.length();
            int min = Math.min(n1, n2);
            for (int i = 0; i < min; i++) {
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(i);
                if (c1 != c2) {
                    return c1 - c2;
                }
            }

            if (n1 == n2) {
                return 0;
            } else {
                return compare(s1 + s2, s2 + s1);
            }
        }
    }
}
