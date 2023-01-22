package ch03.Ex3_23;

import java.awt.*;
import java.awt.geom.Line2D;

public class LetterL {
    private int xTopLeft;
    private int yTopLeft;
    private Color color;
    private int height;
    private int width;

    public LetterL(int xTopLeft, int yTopLeft, Color color) {
        this.xTopLeft = xTopLeft;
        this.yTopLeft = yTopLeft;
        this.color = color;
        this.height = 50;
        this.width = 25;
    }

    public void draw(Graphics2D g2) {
        g2.setColor(color);

        Line2D.Double line1 = new Line2D.Double(xTopLeft, yTopLeft, xTopLeft, yTopLeft + height);
        Line2D.Double line2 = new Line2D.Double(xTopLeft, yTopLeft + height, xTopLeft + width, yTopLeft + height);

        g2.draw(line1);
        g2.draw(line2);

    }
}
