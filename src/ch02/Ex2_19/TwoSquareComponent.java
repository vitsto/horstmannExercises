package ch02.Ex2_19;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
;

public class TwoSquareComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;

        Ellipse2D.Double ellipse = new Ellipse2D.Double(100,100,1,1);
        graphics2D.fill(ellipse);

        Rectangle rectangle = new Rectangle(75,75,50,50);
        graphics2D.draw(rectangle);

        rectangle.translate(10, 10);
        rectangle.setSize(30,30);
        graphics2D.draw(rectangle);
    }
}
