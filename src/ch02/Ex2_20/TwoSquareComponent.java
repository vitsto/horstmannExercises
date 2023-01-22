package ch02.Ex2_20;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

;

public class TwoSquareComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;

        graphics2D.setColor(Color.PINK);

        Rectangle rectangle = new Rectangle(75,75,50,50);
        graphics2D.fill(rectangle);

        graphics2D.setColor(Color.MAGENTA);
        rectangle.translate(50, 50);
        rectangle.setSize(30,30);
        graphics2D.fill(rectangle);
    }
}
