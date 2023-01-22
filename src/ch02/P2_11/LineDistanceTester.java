package ch02.P2_11;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class LineDistanceTester {
    public static void main(String[] args) {
        Line2D.Double line = new Line2D.Double(100,100,200,200);

        Point2D.Double point1 = new Point2D.Double(100,200);
        Point2D.Double point2 = new Point2D.Double(150,150);
        Point2D.Double point3 = new Point2D.Double(250,50);

        System.out.println(line.ptSegDist(point1));
        System.out.println(line.ptSegDist(point2));
        System.out.println(line.ptSegDist(point3));
    }
}
