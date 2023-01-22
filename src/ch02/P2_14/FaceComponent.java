package ch02.P2_14;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;


public class FaceComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;

        Rectangle rectangle = new Rectangle(150,150,100,100);
        Ellipse2D.Double circle = new Ellipse2D.Double();
        graphics2D.setColor(Color.MAGENTA);

        circle.setFrame(rectangle);
        graphics2D.draw(circle);

        rectangle.translate(19,25);
        rectangle.setSize(12,12);
        circle.setFrame(rectangle);
        graphics2D.draw(circle);

        rectangle.translate(12+19+19,0);
        circle.setFrame(rectangle);
        graphics2D.draw(circle);

        Line2D.Double line = new Line2D.Double(150+19,150+50+25,150+19+12+19+19+12,150+50+25);
        graphics2D.draw(line);
    }
}
