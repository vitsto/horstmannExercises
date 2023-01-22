package ch03.E3_19;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Target {
    private int xCenter;
    private int radius;
    private int yCenter;
    private int xTopLeft, yTopLeft;

    public Target(int radius, int xCenter, int yCenter) {
        this.radius = radius;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    public void draw(Graphics2D g2) {
        g2.setColor(Color.BLACK);
        xTopLeft = xCenter - radius;
        yTopLeft = yCenter - radius;
        Rectangle rectangle = new Rectangle(xTopLeft, yTopLeft, radius * 2, radius * 2);
        Ellipse2D.Double circle = new Ellipse2D.Double();
        circle.setFrame(rectangle);
        g2.fill(circle);

        while (radius > 0) {
            g2.setColor(g2.getColor() == Color.BLACK ? Color.WHITE : Color.BLACK);
            radius -= 20;
            xTopLeft = xCenter - radius;
            yTopLeft = yCenter - radius;
            rectangle.setLocation(xTopLeft, yTopLeft);
            rectangle.setSize(radius * 2, radius * 2);
            circle.setFrame(rectangle);
            g2.fill(circle);
        }

    }
}
