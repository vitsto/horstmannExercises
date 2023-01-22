package ch03.Ex3_23;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class LetterO {
    private int xTopLeft;
    private int yTopLeft;
    private Color color;
    private int height;
    private int width;

    public LetterO(int xTopLeft, int yTopLeft, Color color) {
        this.xTopLeft = xTopLeft;
        this.yTopLeft = yTopLeft;
        this.color = color;
        this.height = 50;
        this.width = 25;
    }

    public void draw(Graphics2D g2) {
        g2.setColor(color);

        Rectangle rectangle = new Rectangle(xTopLeft, yTopLeft, width, height);
        Ellipse2D.Double ellipse = new Ellipse2D.Double();
        ellipse.setFrame(rectangle);
        g2.draw(ellipse);
    }
}
