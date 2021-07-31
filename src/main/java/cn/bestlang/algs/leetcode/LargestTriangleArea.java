package cn.bestlang.algs.leetcode;

public class LargestTriangleArea {
    public double largestTriangleArea(int[][] points) {
        int len = points.length;
        double maxArea = 0;
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {
                    double area = area(points[i], points[j], points[k]);
                    if (area > maxArea) {
                        maxArea = area;
                    }
                }
            }
        }

        return maxArea;
    }

    private double area(int[] a, int[] b, int[] c) {
        double d1 = distance(a, b);
        double d2 = distance(b, c);
        double d3 = distance(a, c);

        double p = (d1 + d2 + d3) / 2;
        return Math.sqrt(p * (p - d1) * (p - d2) * (p - d3));
    }

    private double distance(int[] a, int[] b) {
        return Math.sqrt(Math.pow(a[0] - b[0], 2) + Math.pow(a[1] - b[1], 2));
    }
}
