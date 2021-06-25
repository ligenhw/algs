package cn.bestlang.algs.leetcode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class MaxPoints {

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static Point createPoint(int x, int y) {
            return new Point(x, y);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    static class Line {
        double k;
        double b;

        Integer x;

        int count;

        public Line(double k, double b) {
            this.k = k;
            this.b = b;
        }

        public Line(int x) {
            this.x = x;
        }

        public static Line createLine(Point p1, Point p2) {
            double k = 0;
            if ((p2.x - p1.x) == 0) {
                return new Line(p2.x);
            } else {
                k = (p2.y - p1.y) * 1.0 / (p2.x - p1.x);
            }
            double b = p1.y - k * (p1.x);
            return new Line(k, b);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Line line = (Line) o;
            if (line.x != null) {
                return line.x == x;
            }
            return k == line.k && b == line.b;
        }

        @Override
        public int hashCode() {
            return Objects.hash(k, b);
        }

        @Override
        public String toString() {
            return "Line{" +
                    "k=" + k +
                    ", b=" + b +
                    ", x=" + x +
                    ", count=" + count +
                    '}';
        }
    }

    public int maxPoints(int[][] points) {
        Set<Point> sets = new HashSet<>();
        Set<Line> lines = new HashSet<>();
        if (points.length == 0) {
            return 0;
        }
        if (points.length == 1) {
            return 1;
        }
        Point point1 = Point.createPoint(points[0][0], points[0][1]);
        Point point2 = Point.createPoint(points[1][0], points[1][1]);
        sets.add(point1);
        sets.add(point2);
        Line line1 = Line.createLine(point1, point2);
        line1.count = 2;
        lines.add(line1);

        for (int i = 2; i < points.length; i++) {
            int[] point = points[i];

            Point p = Point.createPoint(point[0], point[1]);
            checkLines(lines, p);

            checkNewLine(lines, sets, p);

            sets.add(p);
        }

        int maxCount = 0;
        for (Line line : lines) {
            if (line.count > maxCount) {
                maxCount = line.count;
            }
        }
        return maxCount;
    }

    private void checkNewLine(Set<Line> lines, Set<Point> sets, Point p) {
        for (Point oldPoint : sets) {
            Line l = Line.createLine(oldPoint, p);
            if (!lines.contains(l)) {
                l.count = 2;
                lines.add(l);
            }
        }
    }

    private void checkLines(Set<Line> lines, Point p) {
        for (Line l : lines) {
            if (l.x != null) {
                if (l.x == p.x) {
                    l.count++;
                }
            } else if (l.k * p.x + l.b == p.y) {
                l.count++;
            }
        }
    }
}
