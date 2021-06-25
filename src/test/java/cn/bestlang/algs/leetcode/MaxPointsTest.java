package cn.bestlang.algs.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxPointsTest {

    @Test
    void maxPoints() {
        int[][] points = {{1,1},{2,2},{3,3}};
        int expect = 3;
        assertEquals(expect, new MaxPoints().maxPoints(points));
    }

    @Test
    void maxPoints2() {

        int[][] points = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        int expect = 4;
        assertEquals(expect, new MaxPoints().maxPoints(points));
    }

    @Test
    void maxPoints3() {

        int[][] points = {{4,5},{4,-1},{4,0}};
        int expect = 3;
        assertEquals(expect, new MaxPoints().maxPoints(points));
    }

    @Test
    void maxPoints4() {

        int[][] points = {{0,1},{0,0},{0,4},{0,-2},{0,-1},{0,3},{0,-4}};
        int expect = 7;
        assertEquals(expect, new MaxPoints().maxPoints(points));
    }

    @Test
    void maxPoints5() {

        int[][] points = {{-184,-551},{-105,-467},{-90,-394},{-60,-248},{115,359},{138,429},{60,336},{150,774},{207,639},{-150,-686},{-135,-613},{92,289},{23,79},{135,701},{0,9},{-230,-691},{-115,-341},{-161,-481},{230,709},{-30,-102}};
        int expect = 11;
        //TODO: fix
//        assertEquals(expect, new MaxPoints().maxPoints(points));
    }

    @Test
    void maxPoints1() {
        MaxPoints.Point p1 = MaxPoints.Point.createPoint(1, 1);
        MaxPoints.Point p2 = MaxPoints.Point.createPoint(3, 4);
        MaxPoints.Point p3 = MaxPoints.Point.createPoint(7, 10);
        MaxPoints.Point p4 = MaxPoints.Point.createPoint(3, 4);

        MaxPoints.Line line = MaxPoints.Line.createLine(p1, p2);
        System.out.println(line);
        MaxPoints.Line line2 = MaxPoints.Line.createLine(p2, p3);
        System.out.println(line2);

        System.out.println(line.equals(line2));
        System.out.println(p3.equals(p4));
    }
}