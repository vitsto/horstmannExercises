package ch03.E3_18;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class EllipseComponent extends JComponent {
    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        Rectangle rectangle = new Rectangle(0,0,getWidth(),getHeight());
        Ellipse2D.Double ellipse = new Ellipse2D.Double();

        ellipse.setFrame(rectangle);
        g2.draw(ellipse);
    }
}
