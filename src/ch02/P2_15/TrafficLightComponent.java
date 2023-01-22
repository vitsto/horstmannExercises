package ch02.P2_15;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;


public class TrafficLightComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;

        Rectangle rectangle = new Rectangle(150, 150, 30, 90);
        graphics2D.draw(rectangle);

        Ellipse2D.Double circle = new Ellipse2D.Double();

        graphics2D.setColor(Color.RED);
        rectangle.setSize(30,30);
        circle.setFrame(rectangle);
        graphics2D.fill(circle);

        rectangle.translate(0,30);
        graphics2D.setColor(Color.ORANGE);
        circle.setFrame(rectangle);
        graphics2D.fill(circle);

        rectangle.translate(0,30);
        graphics2D.setColor(Color.GREEN);
        circle.setFrame(rectangle);
        graphics2D.fill(circle);

        graphics2D.setColor(Color.BLACK);
        Line2D.Double line = new Line2D.Double(165,240,165,300);
        graphics2D.draw(line);
    }
}
