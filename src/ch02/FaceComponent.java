package ch02;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class FaceComponent extends JComponent {
    public void paintComponent(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics;

        // Draw the head
        Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 100, 150);
        graphics2D.draw(head);

        // Draw the eyes
        graphics2D.setColor(Color.GREEN);
        Rectangle eye = new Rectangle(25, 70, 15, 15);
        graphics2D.draw(eye);
        eye.translate(50, 0);
        graphics2D.fill(eye);

        // Draw the mouth
        Line2D.Double mouth = new Line2D.Double(30, 110, 80, 110);
        graphics2D.setColor(Color.RED);
        graphics2D.draw(mouth);

        // Draw the greeting
        graphics2D.setColor(Color.BLUE);
        graphics2D.drawString("Hello world!", 5, 175);
    }
}
