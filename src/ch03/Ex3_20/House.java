package ch03.Ex3_20;

import java.awt.*;
import java.awt.geom.Line2D;

public class House {
    private int xLeftTop;
    private int yLeftTop;
    private int width;
    private int height;

    public House(int xLeftTop, int yLeftTop, int width, int height) {
        this.xLeftTop = xLeftTop;
        this.yLeftTop = yLeftTop;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics2D g2) {
        Rectangle wall = new Rectangle(
                xLeftTop,
                (int) (yLeftTop + height * 0.35),
                width,
                (int) (height * 0.65)
        );
        g2.draw(wall);

        Rectangle door = new Rectangle(
                (int) (wall.getX() + wall.getWidth() * 0.15),
                (int) (wall.getY() + wall.getHeight() * 0.4),
                (int) (wall.getWidth() * 0.35),
                (int) (wall.getHeight() * 0.6)
        );
        g2.draw(door);

        Rectangle window = new Rectangle(
                (int) (wall.getX() + wall.getWidth() * 0.55),
                (int) (wall.getY() + wall.getHeight() * 0.55),
                (int) (wall.getWidth() * 0.35),
                (int) (wall.getHeight() * 0.35)
        );
        g2.draw(window);

        Line2D.Double line1 = new Line2D.Double(wall.getX(), wall.getY(), xLeftTop + 0.5 * width, yLeftTop);
        g2.draw(line1);

        Line2D.Double line2 = new Line2D.Double(wall.getX() + wall.getWidth(), wall.getY(), xLeftTop + 0.5 * width, yLeftTop);
        g2.draw(line2);
    }
}
