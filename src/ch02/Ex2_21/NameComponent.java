package ch02.Ex2_21;

import javax.swing.*;
import java.awt.*;

;

public class NameComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;

        graphics2D.setColor(Color.BLUE);
        Rectangle rectangle = new Rectangle(25,75,150,50);
        graphics2D.fill(rectangle);

        graphics2D.setColor(Color.RED);
        graphics2D.drawString("Виталий", 50, 100);


    }
}
