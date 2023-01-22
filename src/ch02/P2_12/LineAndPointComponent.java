package ch02.P2_12;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class LineAndPointComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;

        Line2D.Double line = new Line2D.Double(100,100,200,200);
        graphics2D.draw(line);

        Point2D.Double p1 = new Point2D.Double(100,200);
        Point2D.Double p2 = new Point2D.Double(150,150);
        Point2D.Double p3 = new Point2D.Double(250,50);

        Ellipse2D.Double el1 = new Ellipse2D.Double(p1.getX(), p1.getY(), 4, 4);
        Ellipse2D.Double el2 = new Ellipse2D.Double(p2.getX(), p2.getY(), 4, 4);
        Ellipse2D.Double el3 = new Ellipse2D.Double(p3.getX(), p3.getY(), 4, 4);
        graphics2D.fill(el1);
        graphics2D.fill(el2);
        graphics2D.fill(el3);

        graphics2D.drawString("Distance: " + line.ptSegDist(p1), (int)p1.getX(), (int)p1.getY());
        graphics2D.drawString("Distance: " + line.ptSegDist(p2), (int)p2.getX(), (int)p2.getY());
        graphics2D.drawString("Distance: " + line.ptSegDist(p3), (int)p3.getX(), (int)p3.getY());
    }
}
